public abstract class e.f.a.b.c.l.k.o {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.a.b.c.l.k.o ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.google.android.gms.common.api.Status a ( android.os.RemoteException p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* .line 2 */
		 v1 = 		 e.f.a.b.c.p.h .b ( );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* instance-of v1, p0, Landroid/os/TransactionTooLargeException; */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 final String v1 = "TransactionTooLargeException: "; // const-string v1, "TransactionTooLargeException: "
				 /* .line 3 */
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 4 */
			 } // :cond_0
			 (( android.os.RemoteException ) p0 ).getLocalizedMessage ( ); // invoke-virtual {p0}, Landroid/os/RemoteException;->getLocalizedMessage()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* .line 5 */
			 /* new-instance p0, Lcom/google/android/gms/common/api/Status; */
			 /* const/16 v1, 0x8 */
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {p0, v1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V */
		 } // .end method
		 public static com.google.android.gms.common.api.Status b ( android.os.RemoteException p0 ) { //synthethic
			 /* .locals 0 */
			 /* .line 1 */
			 e.f.a.b.c.l.k.o .a ( p0 );
		 } // .end method
		 /* # virtual methods */
		 public abstract void a ( com.google.android.gms.common.api.Status p0 ) {
		 } // .end method
		 public abstract void a ( Object p0 ) {
			 /* .annotation system Ldalvik/annotation/Signature; */
			 /* value = { */
			 /* "(", */
			 /* "Le/f/a/b/c/l/k/c<", */
			 /* "*>;)V" */
			 /* } */
		 } // .end annotation
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/os/DeadObjectException; */
		 /* } */
	 } // .end annotation
} // .end method
public abstract void a ( Object p0, Boolean p1 ) {
} // .end method
public abstract void a ( java.lang.RuntimeException p0 ) {
} // .end method
