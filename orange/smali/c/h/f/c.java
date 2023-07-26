public abstract class c.h.f.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.graphics.drawable.Drawable a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;
	 } // .end method
	 public static java.io.File a ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.content.Context ) p0 ).getCodeCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;
	 } // .end method
	 public static java.io.File b ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getNoBackupFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;
	 } // .end method
