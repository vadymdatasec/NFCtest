public class e.h.d.a.a.g.j implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.h.d.a.a.g.k b; //synthetic
	 /* # direct methods */
	 public e.h.d.a.a.g.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public e.h.d.a.a.g.j ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1}, Le/h/d/a/a/g/j;-><init>(Le/h/d/a/a/g/k;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 e.h.d.a.a.g.k .a ( v0 );
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.b;
		 e.h.d.a.a.n.t .b ( );
		 e.h.d.a.a.g.k .a ( v0,v1 );
		 /* .line 3 */
		 v0 = this.b;
		 e.h.d.a.a.g.k .b ( v0 );
		 v2 = com.orange.business.packid.android.lib.TransactionErrorType.GATT_TIMEOUT;
		 int v3 = 1; // const/4 v3, 0x1
		 final String v4 = "GATT server timeout"; // const-string v4, "GATT server timeout"
		 (( e.h.d.a.a.g.k ) v0 ).a ( v1, v4, v3, v2 ); // invoke-virtual {v0, v1, v4, v3, v2}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
		 /* .line 4 */
		 v0 = this.b;
		 e.h.d.a.a.g.k .b ( v0 );
		 (( android.bluetooth.BluetoothGatt ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V
	 } // :cond_0
	 return;
} // .end method
