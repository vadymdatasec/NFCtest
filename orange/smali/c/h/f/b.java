public abstract class c.h.f.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.io.File a ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getExternalCacheDirs ( ); // invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDirs()[Ljava/io/File;
	 } // .end method
	 public static java.io.File a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.content.Context ) p0 ).getExternalFilesDirs ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;
	 } // .end method
	 public static java.io.File b ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getObbDirs ( ); // invoke-virtual {p0}, Landroid/content/Context;->getObbDirs()[Ljava/io/File;
	 } // .end method
