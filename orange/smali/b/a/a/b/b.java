public abstract class b.a.a.b.b extends android.os.Binder implements b.a.a.b.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public b.a.a.b.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
		 final String v0 = "android.support.v4.os.IResultReceiver"; // const-string v0, "android.support.v4.os.IResultReceiver"
		 /* .line 2 */
		 (( android.os.Binder ) p0 ).attachInterface ( p0, v0 ); // invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static b.a.a.b.c a ( android.os.IBinder p0 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
	 } // :cond_0
	 final String v0 = "android.support.v4.os.IResultReceiver"; // const-string v0, "android.support.v4.os.IResultReceiver"
	 /* .line 1 */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 2 */
		 /* instance-of v1, v0, Lb/a/a/b/c; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 3 */
			 /* check-cast v0, Lb/a/a/b/c; */
			 /* .line 4 */
		 } // :cond_1
		 /* new-instance v0, Lb/a/a/b/a; */
		 /* invoke-direct {v0, p0}, Lb/a/a/b/a;-><init>(Landroid/os/IBinder;)V */
	 } // .end method
	 public static b.a.a.b.c e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = b.a.a.b.a.b;
	 } // .end method
	 /* # virtual methods */
	 public android.os.IBinder asBinder ( ) {
		 /* .locals 0 */
	 } // .end method
	 public Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/RemoteException; */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 final String v1 = "android.support.v4.os.IResultReceiver"; // const-string v1, "android.support.v4.os.IResultReceiver"
	 /* if-eq p1, v0, :cond_1 */
	 /* const v2, 0x5f4e5446 */
	 /* if-eq p1, v2, :cond_0 */
	 /* .line 1 */
	 p1 = 	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
	 /* .line 2 */
} // :cond_0
(( android.os.Parcel ) p3 ).writeString ( v1 ); // invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 3 */
} // :cond_1
(( android.os.Parcel ) p2 ).enforceInterface ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
/* .line 4 */
p1 = (( android.os.Parcel ) p2 ).readInt ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
/* .line 5 */
p3 = (( android.os.Parcel ) p2 ).readInt ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 6 */
p3 = android.os.Bundle.CREATOR;
/* check-cast p2, Landroid/os/Bundle; */
} // :cond_2
int p2 = 0; // const/4 p2, 0x0
/* .line 7 */
} // :goto_0
} // .end method
