public abstract class e.f.a.d.a.e.e0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.d.a.e.e0 ( ) {
		 /* .locals 1 */
		 /* const-class v0, Le/f/a/d/a/e/e0; */
		 (( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
		 return;
	 } // .end method
	 public static android.os.Parcelable a ( android.os.Parcel p0, android.os.Parcelable$Creator p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T::", */
		 /* "Landroid/os/Parcelable;", */
		 /* ">(", */
		 /* "Landroid/os/Parcel;", */
		 /* "Landroid/os/Parcelable$Creator<", */
		 /* "TT;>;)TT;" */
		 /* } */
	 } // .end annotation
	 v0 = 	 (( android.os.Parcel ) p0 ).readInt ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I
	 /* if-nez v0, :cond_0 */
	 int p0 = 0; // const/4 p0, 0x0
} // :cond_0
/* check-cast p0, Landroid/os/Parcelable; */
} // .end method
public static void a ( android.os.Parcel p0, android.os.IInterface p1 ) {
/* .locals 0 */
(( android.os.Parcel ) p0 ).writeStrongBinder ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
return;
} // .end method
public static void a ( android.os.Parcel p0, android.os.Parcelable p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( android.os.Parcel ) p0 ).writeInt ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
