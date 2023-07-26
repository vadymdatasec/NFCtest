public abstract class e.h.b.a.p.k {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.h.b.a.p.k ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static void a ( android.app.Activity p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "android.settings.LOCATION_SOURCE_SETTINGS"; // const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 (( android.app.Activity ) p0 ).startActivityForResult ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
		 return;
	 } // .end method
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 final String v0 = "location"; // const-string v0, "location"
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/location/LocationManager; */
		 final String v0 = "gps"; // const-string v0, "gps"
		 /* .line 2 */
		 p0 = 		 (( android.location.LocationManager ) p0 ).isProviderEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
	 } // .end method
