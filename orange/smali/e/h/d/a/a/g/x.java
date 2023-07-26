public class e.h.d.a.a.g.x {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 public fr.mbs.binary.Octets b;
	 public Integer c;
	 public java.util.Date d;
	 /* # direct methods */
	 public e.h.d.a.a.g.x ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( android.bluetooth.BluetoothDevice ) p1 ).getAddress ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 /* iput p3, p0, Le/h/d/a/a/g/x;->c:I */
		 /* .line 5 */
		 /* new-instance p1, Ljava/util/Date; */
		 /* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
		 this.d = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public Boolean a ( java.util.Date p0 ) {
		 /* .locals 5 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/Date; */
		 v1 = this.d;
		 (( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v1 */
		 /* const-wide/16 v3, 0x7d0 */
		 /* add-long/2addr v1, v3 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
		 p1 = 		 (( java.util.Date ) v0 ).before ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Date;->before(Ljava/util/Date;)Z
	 } // .end method
	 public java.util.Date b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
	 } // .end method
	 public Integer c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/h/d/a/a/g/x;->c:I */
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 /* if-ne p0, p1, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 1 */
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 /* const-class v1, Le/h/d/a/a/g/x; */
		 /* if-eq v1, v0, :cond_1 */
		 /* .line 2 */
	 } // :cond_1
	 /* check-cast p1, Le/h/d/a/a/g/x; */
	 /* .line 3 */
	 v0 = this.b;
	 p1 = this.b;
	 p1 = 	 (( fr.mbs.binary.Octets ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // :cond_2
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( fr.mbs.binary.Octets ) v0 ).hashCode ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "PackidKnownReader{deviceIdentifier=\'"; // const-string v1, "PackidKnownReader{deviceIdentifier=\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x27 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v1 = ", zoneId="; // const-string v1, ", zoneId="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", rssiValue="; // const-string v1, ", rssiValue="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/h/d/a/a/g/x;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", lastSeen="; // const-string v1, ", lastSeen="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
