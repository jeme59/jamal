import java.io.*;
import java.util.*;

public class UserProfileManager {
    private static final String FILE_PATH = "userProfiles.txt";

    public static void saveProfile(UserProfile profile) {
        List<String> lines = new ArrayList<>();
        boolean updated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4 && parts[0].equals(profile.getEmail())) {
                    // تخطي السطر القديم وتحديثه لاحقًا
                    reader.readLine(); // تخطي سطر الجدول
                    updated = true;
                    continue;
                }
                lines.add(line); // إضافة السطر الحالي
            }
        } catch (IOException e) {
            // إذا الملف مش موجود، نكمل عادي
        }

        // نضيف البيانات الجديدة للبروفايل
        lines.add(profile.getEmail() + "," + profile.getGender() + "," + profile.getTrainingType() + "," + profile.getWorkoutDays());
        lines.add(String.join(",", profile.getSchedule()));

        // إعادة كتابة الملف بالكامل
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (updated) {
            System.out.println("✅ تم تحديث الحساب بنجاح.");
        } else {
            System.out.println("✅ تم إنشاء حساب جديد.");
        }
    }

    public static UserProfile loadProfile(String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(email)) {
                    String gender = parts[1];
                    String trainingType = parts[2];
                    int workoutDays = Integer.parseInt(parts[3]);

                    // قراءة السطر التالي للجدول
                    String scheduleLine = reader.readLine(); // السطر التالي بعد البيانات
                    String[] schedule = scheduleLine != null ? scheduleLine.split(",") : new String[0];

                    UserProfile profile = new UserProfile(email, gender, trainingType, workoutDays);
                    profile.setSchedule(schedule);
                    return profile;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}






//import java.io.*;
//import java.util.*;
//
//public class UserProfileManager {
//
//
//    private static final String FILE_PATH = "userProfiles.txt";
//
//    public static void saveProfile(UserProfile profile) {
//        List<String> lines = new ArrayList<>();
//        boolean updated = false;
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
//                if (parts.length >= 4 && parts[0].equals(profile.getEmail())) {
//                    // تخطي السطر القديم وتحديثه لاحقًا
//                    reader.readLine(); // تخطي سطر الجدول
//                    updated = true;
//                    continue;
//                }
//                lines.add(line); // إضافة السطر الحالي
//            }
//        } catch (IOException e) {
//            // إذا الملف مش موجود، نكمل عادي
//        }
//
//        // نضيف البيانات الجديدة للبروفايل
//        lines.add(profile.getEmail() + "," + profile.getGender() + "," + profile.getTrainingType() + "," + profile.getWorkoutDays());
//        lines.add(String.join(",", profile.getSchedule()));
//
//        // إعادة كتابة الملف بالكامل
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
//            for (String l : lines) {
//                writer.write(l);
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if (updated) {
//
//                System.out.println("✅ تم تحديث الحساب بنجاح.");
//
//        } else {
//            System.out.println("✅ تم إنشاء حساب جديد.");
//        }
//    }
//
//    public static UserProfile loadProfile(String email) {
//        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
//                if (parts[0].equals(email)) {
//                    String gender = parts[1];
//                    String trainingType = parts[2];
//                    int workoutDays = Integer.parseInt(parts[3]);
//
//                    // قراءة السطر التالي للجدول
//                    String scheduleLine = reader.readLine(); // السطر التالي بعد البيانات
//                    String[] schedule = scheduleLine != null ? scheduleLine.split(",") : new String[0];
//
//                    UserProfile profile = new UserProfile(email, gender, trainingType, workoutDays);
//                    profile.setSchedule(schedule);
//                    return profile;
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//}
