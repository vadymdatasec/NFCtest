public abstract class e.f.a.d.a.e.d0 extends android.os.Binder implements android.os.IInterface {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.a.d.a.e.d0 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
		 (( android.os.Binder ) p0 ).attachInterface ( p0, p1 ); // invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract Boolean a ( Integer p0, android.os.Parcel p1 ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
} // .end method
public final android.os.IBinder asBinder ( ) {
	 /* .locals 0 */
} // .end method
public final Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Landroid/os/RemoteException; */
	 /* } */
} // .end annotation
/* const v0, 0xffffff */
/* if-le p1, v0, :cond_0 */
p3 = /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
if ( p3 != null) { // if-eqz p3, :cond_1
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
(( android.os.Binder ) p0 ).getInterfaceDescriptor ( ); // invoke-virtual {p0}, Landroid/os/Binder;->getInterfaceDescriptor()Ljava/lang/String;
(( android.os.Parcel ) p2 ).enforceInterface ( p3 ); // invoke-virtual {p2, p3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
} // :cond_1
p1 = (( e.f.a.d.a.e.d0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/d/a/e/d0;->a(ILandroid/os/Parcel;)Z
} // .end method
