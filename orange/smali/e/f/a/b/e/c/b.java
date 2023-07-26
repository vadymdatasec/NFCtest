public abstract class e.f.a.b.e.c.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.b.e.c.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* const-class v0, Le/f/a/b/e/c/b; */
		 (( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
		 return;
	 } // .end method
	 public static void a ( android.os.Parcel p0, android.os.IInterface p1 ) {
		 /* .locals 0 */
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 1 */
		 (( android.os.Parcel ) p0 ).writeStrongBinder ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
		 return;
		 /* .line 2 */
	 } // :cond_0
	 (( android.os.Parcel ) p0 ).writeStrongBinder ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
	 return;
} // .end method
