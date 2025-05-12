import java.util.Scanner;

public class LanguageHandler {

    public static void handleLanguageChoice(int langChoice, Scanner scan, int userAction, String langCode) {
        switch (langChoice) {
            case 1:
                // استدعاء دالة اللغة العربية
                handleArabicLanguage(scan, userAction, langCode);
                break;
            case 2:
                // استدعاء دالة اللغة الإنجليزية
                handleEnglishLanguage(scan, userAction, langCode);
                break;
            case 3:
                // استدعاء دالة اللغة العبرية
                handleHebrewLanguage(scan, userAction, langCode);
                break;
            default:
                System.out.println("Invalid language choice.");
                break;
        }
    }

    private static void handleArabicLanguage(Scanner scan, int userAction, String langCode) {
        if (userAction == 1) {
            // إنشاء حساب جديد باللغة العربية
            System.out.print("أدخل الايميل: ");
            String email = scan.nextLine();

            System.out.print("هل أنت ذكر أم أنثى؟ (m/f): ");
            String gender = scan.nextLine();

            System.out.print("هل تفضل التمارين الحرة أم الأجهزة؟ (حرة/أجهزة): ");
            String trainingType = scan.nextLine();

            System.out.print("كم يوم في الأسبوع تستطيع التمرن؟ ");
            int workoutDays = scan.nextInt();
            scan.nextLine(); // للتأكد من إزالة الفاصل بعد العدد

            WeeklyProgram weeklyProgram = new WeeklyProgram();
            weeklyProgram.showProgramForDays(workoutDays, langCode);

            // حفظ البروفايل
            UserProfile profile = new UserProfile(email, gender, trainingType, workoutDays);
            profile.setSchedule(weeklyProgram.getSchedule());
            UserProfileManager.saveProfile(profile);

            System.out.println("تم حفظ حسابك بنجاح ✅");

            // 💪 عرض التمارين
            System.out.print("هل ترغب بعرض تمارين اليوم؟ (نعم/لا): ");
            String viewWorkouts = scan.nextLine();

            if (viewWorkouts.equalsIgnoreCase("نعم")) {
                int days = profile.getWorkoutDays();

                if (days >= 1 && days <= 3 ) {
                    System.out.println("💡 اقتراحات لأنظمة التمرين المناسبة لك:");
                    System.out.println("1. Full Body");
                    System.out.println("2. Push / Pull / Legs");
                    System.out.println("3. Upper / Lower");
                    System.out.print("اختر نظام التمرين: ");
                    int systemChoice = scan.nextInt();
                    scan.nextLine();

                    switch (systemChoice) {
                        case 1:
                            WorkoutLibrary.showFullBody(gender, trainingType, langCode);
                            break;
                        case 2:
                            WorkoutLibrary.showPushPullLegs(gender, trainingType, langCode);
                            break;
                        case 3:
                            WorkoutLibrary.showUpperLower(gender, trainingType, langCode);
                            break;
                        default:
                            System.out.println("خيار غير صالح");
                    }
                } else if (days >= 4 && days <= 6) {
                    System.out.println("💪 تقسيمات التمرين المقترحة:");
                    System.out.println("1. صدر + تراي");
                    System.out.println("2. ظهر + باي");
                    System.out.println("3. أرجل");
                    System.out.println("4. كتف");

                    System.out.print("اختر رقم التمرين: ");
                    int workoutChoice = scan.nextInt();
                    scan.nextLine();

                    WorkoutLibrary.showWorkoutByChoice(workoutChoice, gender, trainingType, langCode);
                }
                else {
                    System.out.println("امعط");
                }
            }
        } else if (userAction == 2) {
            // تسجيل الدخول باللغة العربية
            System.out.print("أدخل الإيميل: ");
            String email = scan.nextLine();

            UserProfile profile = UserProfileManager.loadProfile(email);

            if (profile == null) {
                System.out.println("لم يتم العثور على الحساب، الرجاء إنشاء حساب أولاً.");
                return;
            }

            System.out.println("مرحبًا " + profile.getEmail() + " 👋");
            System.out.println("معك الكوتش جيمي.");
            System.out.println("الجدول الأسبوعي الخاص بك:");

            String[] schedule = profile.getSchedule();
            if (schedule != null && schedule.length > 0) {
                for (int i = 0; i < schedule.length; i++) {
                    System.out.println("اليوم " + (i + 1) + ": " + schedule[i]);
                }
            } else {
                System.out.println("الجدول فارغ.");
            }

            System.out.print("هل ترغب بعرض التمارين لليوم؟ (نعم/لا): ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("نعم")) {
                int days = profile.getWorkoutDays();

                if (days >= 1 && days <= 3) {
                    System.out.println("💡 اقتراحات لأنظمة التمرين المناسبة لك:");
                    System.out.println("1. Full Body");
                    System.out.println("2. Push / Pull / Legs");
                    System.out.println("3. Upper / Lower");
                    System.out.println("---------------------------------");

                    System.out.print("اختر نظام التمرين الذي تفضله (اكتب الرقم): ");
                    int systemChoice = scan.nextInt();
                    scan.nextLine();

                    switch (systemChoice) {
                        case 1:
                            System.out.println("🔥 اخترت نظام Full Body. هذه التمارين:");
                            WorkoutLibrary.showFullBody(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        case 2:
                            System.out.println("🔥 اخترت نظام Push / Pull / Legs. هذه التمارين:");
                            WorkoutLibrary.showPushPullLegs(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        case 3:
                            System.out.println("🔥 اخترت نظام Upper / Lower. هذه التمارين:");
                            WorkoutLibrary.showUpperLower(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        default:
                            System.out.println("خيار غير صحيح، سيتم عرض قائمة التمارين العامة.");
                    }
                } else if (days >= 4 && days <= 6) {
                    System.out.println("💪 تقسيمات التمرين المقترحة:");
                    System.out.println("1. صدر + تراي");
                    System.out.println("2. ظهر + باي");
                    System.out.println("3. أرجل");
                    System.out.println("4. كتف");

                    System.out.print("اختر رقم التمرين: ");
                    int workoutChoice = scan.nextInt();
                    scan.nextLine();

                    WorkoutLibrary.showWorkoutByChoice(workoutChoice, profile.getGender(), profile.getTrainingType(), langCode);
                }
            }
        }
    }

    private static void handleEnglishLanguage(Scanner scan, int userAction, String langCode) {
        if (userAction == 1) {
            // Create account in English
            System.out.print("Enter email: ");
            String email = scan.nextLine();

            System.out.print("Are you male or female? (m/f): ");
            String gender = scan.nextLine();

            System.out.print("Do you prefer free weights or machines? (Free/Machines): ");
            String trainingType = scan.nextLine();

            System.out.print("How many days per week can you train? ");
            int workoutDays = scan.nextInt();
            scan.nextLine(); // To remove the line separator

            WeeklyProgram weeklyProgram = new WeeklyProgram();
            weeklyProgram.showProgramForDays(workoutDays, langCode);

            // Save profile
            UserProfile profile = new UserProfile(email, gender, trainingType, workoutDays);
            profile.setSchedule(weeklyProgram.getSchedule());
            UserProfileManager.saveProfile(profile);

            System.out.println("Your account has been successfully saved ✅");

            // 💪 Show workouts
            System.out.print("Would you like to view today's workouts? (Yes/No): ");
            String viewWorkouts = scan.nextLine();

            if (viewWorkouts.equalsIgnoreCase("Yes")) {
                int days = profile.getWorkoutDays();

                if (days >= 1 && days <= 3 ) {
                    System.out.println("💡 Suggested workout systems for you:");
                    System.out.println("1. Full Body");
                    System.out.println("2. Push / Pull / Legs");
                    System.out.println("3. Upper / Lower");
                    System.out.print("Choose a workout system: ");
                    int systemChoice = scan.nextInt();
                    scan.nextLine();

                    switch (systemChoice) {
                        case 1:
                            WorkoutLibrary.showFullBody(gender, trainingType, langCode);
                            break;
                        case 2:
                            WorkoutLibrary.showPushPullLegs(gender, trainingType, langCode);
                            break;
                        case 3:
                            WorkoutLibrary.showUpperLower(gender, trainingType, langCode);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }

                }
                else if (days >= 4 && days <= 6) {
                    System.out.println("💪 Suggested workout splits:");
                    System.out.println("1. Chest + triceps");
                    System.out.println("2. Back + biceps");
                    System.out.println("3. Legs");
                    System.out.println("4. Shoulders");

                    System.out.print("Choose your workout number: ");
                    int workoutChoice = scan.nextInt();
                    scan.nextLine();

                    WorkoutLibrary.showWorkoutByChoice(workoutChoice, gender, trainingType, langCode);
                }

            }
        } else if (userAction == 2) {
            // log in E
            System.out.print("Enter email :");
            String email = scan.nextLine();

            UserProfile profile = UserProfileManager.loadProfile(email);

            if (profile == null) {
                System.out.println("Account not found, please create an account first.");
                return;
            }

            System.out.println("HI ! " + profile.getEmail() + " 👋");
            System.out.println("Coach Jimmy is with you.");
            System.out.println("Your weekly schedule:");

            String[] schedule = profile.getSchedule();
            if (schedule != null && schedule.length > 0) {
                for (int i = 0; i < schedule.length; i++) {
                    System.out.println("today " + (i + 1) + ": " + schedule[i]);
                }
            } else {
                System.out.println("The table is empty.");
            }

            System.out.print("Would you like to view today's exercises? (Yes/No): ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                int days = profile.getWorkoutDays();

                if (days >= 1 && days <= 3) {
                    System.out.println("💡 Suggestions for exercise regimens that are right for you:");
                    System.out.println("1. Full Body");
                    System.out.println("2. Push / Pull / Legs");
                    System.out.println("3. Upper / Lower");
                    System.out.println("---------------------------------");

                    System.out.print("Choose your preferred exercise regimen (type number): ");
                    int systemChoice = scan.nextInt();
                    scan.nextLine();

                    switch (systemChoice) {
                        case 1:
                            System.out.println("🔥you chose the Full Body system. These exercises:");
                            WorkoutLibrary.showFullBody(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        case 2:
                            System.out.println("🔥you chose the Push/Pull/Legs system. These exercises:");
                            WorkoutLibrary.showPushPullLegs(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        case 3:
                            System.out.println("🔥 you chose the Upper/Lower system. These exercises:");
                            WorkoutLibrary.showUpperLower(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        default:
                            System.out.println("Incorrect option, the general exercise list will be displayed.");
                    }
                } else if (days >= 4 && days <= 6) {
                    System.out.println("💪 Suggested workout splits:");
                    System.out.println("1.Chest + triceps");
                    System.out.println("2. Back + biceps ");
                    System.out.println("3. legs");
                    System.out.println("4. shoulder");

                    System.out.print("Choose your workout number: ");
                    int workoutChoice = scan.nextInt();
                    scan.nextLine();

                    WorkoutLibrary.showWorkoutByChoice(workoutChoice, profile.getGender(), profile.getTrainingType(), langCode);
                }
            }
        }
    }

    private static void handleHebrewLanguage(Scanner scan, int userAction, String langCode) {
        if (userAction == 1) {
            // Create account in Hebrew (same as English)
            System.out.print("הזן דוא\"ל: ");
            String email = scan.nextLine();

            System.out.print("האם אתה גבר או אישה? (ז/נ): ");
            String gender = scan.nextLine();

            System.out.print("האם אתה מעדיף משקולות חופשיות או מכונות? (חופשי/מכונה): ");
            String trainingType = scan.nextLine();

            System.out.print("כמה ימים בשבוע אתה יכול להתאמן? ");
            int workoutDays = scan.nextInt();
            scan.nextLine(); // To remove the line separator

            WeeklyProgram weeklyProgram = new WeeklyProgram();
            weeklyProgram.showProgramForDays(workoutDays, langCode);

            // Save profile
            UserProfile profile = new UserProfile(email, gender, trainingType, workoutDays);
            profile.setSchedule(weeklyProgram.getSchedule());
            UserProfileManager.saveProfile(profile);

            System.out.println("החשבון שלך נשמר בהצלחה ✅");

            // 💪 Show workouts
            System.out.print("האם תרצה לראות את האימונים להיום? (כן/לא): ");
            String viewWorkouts = scan.nextLine();

            if (viewWorkouts.equalsIgnoreCase("כן")) {
                int days = profile.getWorkoutDays();

                if (days >= 1 && days <= 3 ) {
                    System.out.println("💡 הצעות לאימוני מערכת עבורך:");
                    System.out.println("1. גוף מלא");
                    System.out.println("2. דחיפה / משיכה / רגליים");
                    System.out.println("3. עליון / תחתון");
                    System.out.print("בחר מערכת אימון: ");
                    int systemChoice = scan.nextInt();
                    scan.nextLine();

                    switch (systemChoice) {
                        case 1:
                            WorkoutLibrary.showFullBody(gender, trainingType, langCode);
                            break;
                        case 2:
                            WorkoutLibrary.showPushPullLegs(gender, trainingType, langCode);
                            break;
                        case 3:
                            WorkoutLibrary.showUpperLower(gender, trainingType, langCode);
                            break;
                        default:
                            System.out.println("בחירה לא נכונה");
                    }
                }
            }
        }else if (userAction == 2) {
            // log in H
            System.out.print("הזן אימייל ");
            String email = scan.nextLine();

            UserProfile profile = UserProfileManager.loadProfile(email);

            if (profile == null) {
                System.out.println("החשבון לא נמצא, אנא צור חשבון תחילה.");
                return;
            }

            System.out.println("היי ! " + profile.getEmail() + " 👋");
            System.out.println("המאמן ג'ימי איתך.");
            System.out.println("לוח הזמנים השבועי שלך:");

            String[] schedule = profile.getSchedule();
            if (schedule != null && schedule.length > 0) {
                for (int i = 0; i < schedule.length; i++) {
                    System.out.println("הַיוֹם " + (i + 1) + ": " + schedule[i]);
                }
            } else {
                System.out.println("השולחן ריק.");
            }

            System.out.print("האם תרצה לראות את התרגילים של היום? (כן/לא): ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("כן")) {
                int days = profile.getWorkoutDays();

                if (days >= 1 && days <= 3) {
                    System.out.println("💡 הצעות למשטרי פעילות גופנית המתאימים לך:");
                    System.out.println("1. Full Body");
                    System.out.println("2. Push / Pull / Legs");
                    System.out.println("3. Upper / Lower");
                    System.out.println("---------------------------------");

                    System.out.print("בחר את משטר האימון המועדף עליך (מספר סוג): ");
                    int systemChoice = scan.nextInt();
                    scan.nextLine();

                    switch (systemChoice) {
                        case 1:
                            System.out.println("🔥בחרת במערכת Full Body. התרגילים האלה:");
                            WorkoutLibrary.showFullBody(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        case 2:
                            System.out.println("🔥בחרת במערכת דחיפה/משיכה/רגליים. התרגילים האלה");
                            WorkoutLibrary.showPushPullLegs(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        case 3:
                            System.out.println("🔥 בחרת במערכת העליונה/תחתונה. התרגילים האלה:");
                            WorkoutLibrary.showUpperLower(profile.getGender(), profile.getTrainingType(), langCode);
                            break;
                        default:
                            System.out.println("אפשרות שגויה, רשימת התרגילים הכללית תוצג.");
                    }
                } else if (days >= 4 && days <= 6) {
                    System.out.println("💪 חלוקות אימון מוצעות:");
                    System.out.println("1.Chest + triceps");
                    System.out.println("2. Back + biceps ");
                    System.out.println("3. legs");
                    System.out.println("4. shoulder");

                    System.out.print("בחר את מספר האימון שלך: ");
                    int workoutChoice = scan.nextInt();
                    scan.nextLine();

                    WorkoutLibrary.showWorkoutByChoice(workoutChoice, profile.getGender(), profile.getTrainingType(), langCode);
                }
            }
        }
    }
}
