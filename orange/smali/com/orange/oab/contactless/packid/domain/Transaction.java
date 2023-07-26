public class com.orange.oab.contactless.packid.domain.Transaction {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.util.Date b;
	 public final java.lang.Integer c;
	 public final java.lang.String d;
	 public final fr.mbs.binary.Octets e;
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.domain.Transaction ( ) {
		 /* .locals 7 */
		 /* .line 2 */
		 java.util.UUID .randomUUID ( );
		 (( java.util.UUID ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
		 /* new-instance v5, Ljava/util/Date; */
		 /* invoke-direct {v5}, Ljava/util/Date;-><init>()V */
		 int v4 = 0; // const/4 v4, 0x0
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v1, p0 */
		 /* move-object v3, p1 */
		 /* invoke-direct/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V */
		 return;
	 } // .end method
	 public com.orange.oab.contactless.packid.domain.Transaction ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 java.util.UUID .randomUUID ( );
		 (( java.util.UUID ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
		 /* move-object v1, p0 */
		 /* move-object v3, p1 */
		 /* move-object v4, p2 */
		 /* move-object v5, p3 */
		 /* move-object v6, p4 */
		 /* invoke-direct/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V */
		 return;
	 } // .end method
	 public com.orange.oab.contactless.packid.domain.Transaction ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 4 */
		 this.d = p1;
		 /* .line 5 */
		 this.e = p2;
		 /* .line 6 */
		 this.a = p3;
		 /* .line 7 */
		 this.b = p4;
		 /* .line 8 */
		 this.c = p5;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Integer getAmountInCents ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
	 } // .end method
	 public java.util.Date getDate ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public java.lang.String getDescription ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public java.lang.String getId ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
	 } // .end method
	 public fr.mbs.binary.Octets getZoneId ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.e;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 e.f.b.a.j .a ( p0 );
		 v1 = this.a;
		 final String v2 = "description"; // const-string v2, "description"
		 /* .line 2 */
		 (( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
		 v1 = this.b;
		 final String v2 = "date"; // const-string v2, "date"
		 /* .line 3 */
		 (( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
		 v1 = this.c;
		 final String v2 = "amountInCents"; // const-string v2, "amountInCents"
		 /* .line 4 */
		 (( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
		 v1 = this.d;
		 final String v2 = "id"; // const-string v2, "id"
		 /* .line 5 */
		 (( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
		 v1 = this.e;
		 final String v2 = "zoneId"; // const-string v2, "zoneId"
		 /* .line 6 */
		 (( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
		 /* .line 7 */
		 (( e.f.b.a.j$a ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;
	 } // .end method
