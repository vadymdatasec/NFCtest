public class e.h.d.a.a.s.a0 extends e.h.d.a.a.s.k0.o {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.a0 ( ) {
		 /* .locals 6 */
		 /* move-object v0, p0 */
		 /* move-object v1, p2 */
		 /* move-object v2, p3 */
		 /* move-object v3, p4 */
		 /* move-object v4, p5 */
		 /* move-object v5, p6 */
		 /* .line 1 */
		 /* invoke-direct/range {v0 ..v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.Cursor p0 ) {
		 /* .locals 7 */
		 final String v0 = "id"; // const-string v0, "id"
		 /* .line 1 */
		 v0 = 		 e.h.d.a.a.m .a ( v0,p1 );
		 final String v0 = "zoneId"; // const-string v0, "zoneId"
		 /* .line 2 */
		 v0 = 		 e.h.d.a.a.m .a ( v0,p1 );
		 fr.mbs.binary.Octets .createOctets ( v0 );
		 /* .line 3 */
		 /* new-instance v5, Ljava/util/Date; */
		 final String v0 = "transactionDate"; // const-string v0, "transactionDate"
		 v0 = 		 e.h.d.a.a.m .a ( v0,p1 );
		 /* move-result-wide v0 */
		 /* invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V */
		 final String v0 = "amountInCents"; // const-string v0, "amountInCents"
		 /* .line 4 */
		 v0 = 		 v0 = 		 e.h.d.a.a.m .a ( v0,p1 );
		 final String v1 = "description"; // const-string v1, "description"
		 /* .line 5 */
		 v1 = 		 e.h.d.a.a.m .a ( v1,p1 );
		 /* .line 6 */
		 /* new-instance p1, Lcom/orange/oab/contactless/packid/domain/Transaction; */
		 java.lang.Integer .valueOf ( v0 );
		 /* move-object v1, p1 */
		 /* invoke-direct/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V */
	 } // .end method
