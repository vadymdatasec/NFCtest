public abstract class c.h.f.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.content.Context a ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).createDeviceProtectedStorageContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;
	 } // .end method
	 public static java.io.File b ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getDataDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getDataDir()Ljava/io/File;
	 } // .end method
	 public static Boolean c ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.content.Context ) p0 ).isDeviceProtectedStorage ( ); // invoke-virtual {p0}, Landroid/content/Context;->isDeviceProtectedStorage()Z
	 } // .end method
