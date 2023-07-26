public abstract class c.k.a.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Long a ( java.io.FileDescriptor p0, Long p1, Integer p2 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/system/ErrnoException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 android.system.Os .lseek ( p0,p1,p2,p3 );
	 /* move-result-wide p0 */
	 /* return-wide p0 */
} // .end method
public static void a ( java.io.FileDescriptor p0 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Landroid/system/ErrnoException; */
	 /* } */
} // .end annotation
/* .line 2 */
android.system.Os .close ( p0 );
return;
} // .end method
public static java.io.FileDescriptor b ( java.io.FileDescriptor p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/system/ErrnoException; */
/* } */
} // .end annotation
/* .line 1 */
android.system.Os .dup ( p0 );
} // .end method
