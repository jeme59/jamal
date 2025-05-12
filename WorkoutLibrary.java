public class WorkoutLibrary {

    public static void showWorkoutByChoice(int choice, String gender, String trainingType, String langCode) {
        if (gender.equalsIgnoreCase("أنثى") || gender.equalsIgnoreCase("f")) {
            switch (choice) {
                case 1:
                    System.out.println("تمارين الصدر للنساء:https://www.youtube.com/shorts/3hZU5D-a0eY ");
                    System.out.println("- تمرين ضغط الصدر على الكرة");
                    System.out.println("- ضغط الصدر بالدمبل مائل");
                    break;
                case 2:
                    System.out.println("تمارين الظهر للنساء:https://www.youtube.com/shorts/gKjmsI1wmB4 ");
                    System.out.println("- سحب أرضي");
                    System.out.println("- تمارين الأجنحة بجهاز السحب");
                    break;
                case 3:
                    System.out.println("تمارين الأرجل للنساء:https://www.youtube.com/shorts/HHq5PpfJ87w ");
                    System.out.println("- سكوات وزن الجسم");
                    System.out.println("- الرفعة الرومانية بالدمبل");
                    System.out.println("- صعود الدرج");
                    break;
                case 4:
                    System.out.println("تمارين الأكتاف للنساء:https://www.youtube.com/shorts/N-zFRt39ki0 ");
                    System.out.println("- رفع جانبي خفيف");
                    System.out.println("- ضغط أكتاف باستخدام دمبل خفيف");
                    break;
                case 5:
                    System.out.println("تمارين البطن للنساء:https://www.youtube.com/shorts/-KKfHX56OTY ");
                    System.out.println("- بلانك");
                    System.out.println("- تمرين الدراجة");
                    break;
                default:
                    System.out.println("رقم التمرين غير صحيح.");
            }
        } else {
            switch (choice) {
                case 1:
                    System.out.println("Chest Exercises: https://www.youtube.com/shorts/oBLBHKjEYn4");
                    System.out.println("- Bench Press");
                    System.out.println("- incline bench press dumbbell");
                    System.out.println("decline chest cable");
                    System.out.println("fly machine.");
                    System.out.println("tri rope pushdown");
                    System.out.println("dips machine for triceps");
                    break;
                case 2:
                    System.out.println("Back Exercises: https://www.youtube.com/shorts/vwquyzV1rE0");
                    System.out.println("- Deadlift");
                    System.out.println("- Barbell Row");
                    break;
                case 3:
                    System.out.println("Leg Exercises: https://www.youtube.com/shorts/E9TMx811jOI");
                    System.out.println("- Squat");
                    System.out.println("leg curl machine 1 ");
                    System.out.println("leg curl machine  2");
                    System.out.println("walking lunges");
                    System.out.println("calves workout with dumbbells");
                    break;
                case 4:
                    System.out.println("Shoulder Exercises: https://www.youtube.com/shorts/_CuJMk9TeaQ");
                    System.out.println("- Dumbbell Shoulder Press");
                    System.out.println("- Lateral Raise");
                    break;
                case 5:
                    System.out.println("Abdominal Exercises: https://www.youtube.com/shorts/Cii54H_Xv1M");
                    System.out.println("- Crunches");
                    System.out.println("- Plank");
                    break;
                default:
                    System.out.println("Invalid workout number.");
            }
        }
    }

    public static void showFullBody(String gender, String trainingType, String langCode) {
        if (gender.equalsIgnoreCase("أنثى") || gender.equalsIgnoreCase("f")) {
            System.out.println("🔹 Full Body Workout for Women: https://www.youtube.com/shorts/ShYaLk5sZeA");
            System.out.println("- Bodyweight Squat");
            System.out.println("- Incline Push-up");
            System.out.println("- Glute Bridge");
            System.out.println("- Dumbbell Row");
            System.out.println("- Plank");
        } else {
            System.out.println("🔹 Full Body Workout: https://www.youtube.com/shorts/S3ScjXa7Z2U");
            System.out.println("- Squat");
            System.out.println("- Bench Press");
            System.out.println("- Seated Row");
            System.out.println("- Shoulder Press");
            System.out.println("- Dumbbell Curl");
            System.out.println("- Crunches");
        }
    }

    public static void showPushPullLegs(String gender, String trainingType, String langCode) {
        if (gender.equalsIgnoreCase("أنثى") || gender.equalsIgnoreCase("f")) {
            System.out.println("🔸 Push (Women): https://www.youtube.com/shorts/dJayZxCOH_w");
            System.out.println("- Incline Push-up");
            System.out.println("- Dumbbell Shoulder Press");
            System.out.println("- Triceps Kickbacks");

            System.out.println("🔸 Pull (Women): https://www.youtube.com/shorts/vYPa3bwZEzg");
            System.out.println("- Lat Pulldown");
            System.out.println("- Seated Cable Row");
            System.out.println("- Biceps Curl");

            System.out.println("🔸 Legs (Women): https://www.youtube.com/shorts/phGj_ogaAl4");
            System.out.println("- Glute Bridge");
            System.out.println("- Bodyweight Lunges");
            System.out.println("- Calf Raises");
        } else {
            System.out.println("🔸 Push: https://www.youtube.com/shorts/hjgFpiqUwdY");
            System.out.println("- Bench Press");
            System.out.println("- Shoulder Press");
            System.out.println("- Cable Triceps Pushdown");

            System.out.println("🔸 Pull: https://www.youtube.com/shorts/a2TMJ1HCtjM");
            System.out.println("- Seated Row");
            System.out.println("- Barbell Row");
            System.out.println("- Dumbbell Curl");

            System.out.println("🔸 Legs: https://www.youtube.com/shorts/DzKc38NKMfI");
            System.out.println("- Squat");
            System.out.println("- Lunges");
            System.out.println("- Calf Raises");
        }
    }

    public static void showUpperLower(String gender, String trainingType, String langCode) {
        if (gender.equalsIgnoreCase("أنثى") || gender.equalsIgnoreCase("f")) {
            System.out.println("🔹 Upper Body (Women): https://www.youtube.com/shorts/ShYaLk5sZeA");
            System.out.println("- Incline Push-up");
            System.out.println("- Lateral Raises");
            System.out.println("- Dumbbell Curl");

            System.out.println("🔹 Lower Body (Women): https://www.youtube.com/shorts/SQvuZNovE4Y");
            System.out.println("- Bodyweight Squats");
            System.out.println("- Glute Kickbacks");
            System.out.println("- Crunches");
        } else {
            System.out.println("🔹 Upper Body: https://www.youtube.com/shorts/S3ScjXa7Z2U");
            System.out.println("- Bench Press");
            System.out.println("- Shoulder Press");
            System.out.println("- Biceps & Triceps");

            System.out.println("🔹 Lower Body: https://www.youtube.com/shorts/ny1q5XJJsME");
            System.out.println("- Squat");
            System.out.println("- Lunges");
            System.out.println("- Crunches");
        }
    }
}
