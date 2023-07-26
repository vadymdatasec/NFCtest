public abstract class e.f.a.b.e.c.a extends android.os.Binder implements android.os.IInterface {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public static e.f.a.b.e.c.a ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public e.f.a.b.e.c.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
		 /* .line 2 */
		 (( android.os.Binder ) p0 ).attachInterface ( p0, p1 ); // invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.os.IBinder asBinder ( ) {
	 /* .locals 0 */
} // .end method
public Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Landroid/os/RemoteException; */
	 /* } */
} // .end annotation
/* const v0, 0xffffff */
/* if-le p1, v0, :cond_0 */
/* .line 1 */
v0 = /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
/* .line 2 */
} // :cond_0
(( android.os.Binder ) p0 ).getInterfaceDescriptor ( ); // invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;
(( android.os.Parcel ) p2 ).enforceInterface ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
} // :cond_1
p1 = (( e.f.a.b.e.c.a ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/f/a/b/e/c/a;->a(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
} // .end method
