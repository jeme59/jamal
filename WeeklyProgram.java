public class WeeklyProgram {
    private String[] schedule;

    public void showProgramForDays(int days, String langCode) {
        switch (days) {
            case 1:
                if (langCode.equals("en")) {  // بدل "english"

                    schedule = new String[]{"full body" };
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    schedule = new String[]{"גוף מלא"};
                } else {

                    schedule = new String[]{ "جسم كامل  "};
                }
                break;
            case 2:
                if (langCode.equals("en")) {  // بدل "english"

                    schedule = new String[]{"upper","lower" };
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    schedule = new String[]{"פלג גוף תחתון","עֶלִיוֹן"};
                } else {

                    schedule = new String[]{ "جسم سفلي ", "جسم علوي"};
                }
                break;
            case 3:
                if (langCode.equals("en")) {  // بدل "english"

                    schedule = new String[]{"push", "pull", "Legs"};
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    schedule = new String[]{"לִדחוֹף","מְשׁוֹך","רגליים"};
                } else {
                    schedule = new String[]{"رجل", "سحب", "دفع"};
                }
                break;

            case 4:
                if (langCode.equals("en")) {  // بدل "english"

                    schedule = new String[]{"Chest + Triceps", "Back + Biceps", "Legs", "Shoulders"};
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    schedule = new String[]{"חזה + תלת ראשי", "גב + דו ראשי", "רגליים", "כתפיים"};
                } else {
                    schedule = new String[]{"صدر+تراي", "ظهر+باي", "رجل", "كتف"};
                }
                break;
            case 5:
                if (langCode.equals("en")) {  // بدل "english"

                    schedule = new String[]{"Chest + Triceps", "Back + Biceps", "Legs", "Shoulders", "Cardio + Abs"};
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    schedule = new String[]{"חזה + תלת ראשי", "גב + דו ראשי", "רגליים", "כתפיים", "קרדיו + בטן"};
                } else {
                    schedule = new String[]{"صدر+تراي", "ظهر+باي", "رجل", "كتف", "كارديو+معدة"};
                }
                break;
            case 6:
                if (langCode.equals("en")) {  // بدل "english"

                    schedule = new String[]{"Chest + Triceps", "Back + Biceps", "Legs", "Shoulders", "Chest + Triceps", "Cardio + Abs"};
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    schedule = new String[]{"חזה + תלת ראשי", "גב + דו ראשי", "רגליים", "כתפיים", "חזה + תלת ראשי", "קרדיו + בטן"};
                } else {
                    schedule = new String[]{"صدر+تراي", "ظهر+باي", "رجل", "كتف", "صدر+تراي", "كارديو +معدة"};
                }
                break;
            default:
                if (langCode.equals("en")) {  // بدل "english"

                    System.out.println("Here are the best diets for those who train three days a week.");
                    schedule = new String[]{"Full Body."};
                } else if (langCode.equals("he")) {  // بدل "hebrew"

                    System.out.println("להלן המשטרים הטובים ביותר למי שמתאמן 3 ימים בשבוע.");
                    schedule = new String[]{"אימון גוף מלא"};
                } else {
                    System.out.println("هذه افضل نظم للمتدربين في 3 ايام في الاسبوع.");
                    schedule = new String[]{"Full Body"};
                }
                break;
        }

        // عرض الجدول الأسبوعي
        if (langCode.equals("en")) {  // بدل "english"

            System.out.println("✅ Here's your weekly program:");
            for (int i = 0; i < schedule.length; i++) {
                System.out.println("Day " + (i + 1) + ": " + schedule[i]);
            }
        } else if (langCode.equals("he")) {  // بدل "hebrew"

            System.out.println("✅ זו התוכנית השבועית שלך:");
            for (int i = 0; i < schedule.length; i++) {
                System.out.println("יום " + (i + 1) + ": " + schedule[i]);
            }
        } else {
            System.out.println("✅ هذا هو جدولك الأسبوعي:");
            for (int i = 0; i < schedule.length; i++) {
                System.out.println("اليوم " + (i + 1) + ": " + schedule[i]);
            }
        }
    }

    public String[] getSchedule() {
        return schedule;
    }
}
