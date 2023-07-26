public abstract class c.h.f.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.content.Context p0, android.content.Intent p1, android.os.Bundle p2 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.content.Context ) p0 ).startActivity ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0, android.content.Intent[] p1, android.os.Bundle p2 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).startActivities ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V
		 return;
	 } // .end method
