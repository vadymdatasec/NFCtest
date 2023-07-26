public class e.h.d.a.a.s.y extends e.h.d.a.a.s.k0.z {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/z<", */
	 /* "Lcom/orange/oab/contactless/packid/domain/Transaction;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final com.orange.oab.contactless.packid.domain.Transaction c; //synthetic
/* # direct methods */
public e.h.d.a.a.s.y ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p4;
	 /* invoke-direct {p0, p2, p3}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public android.content.ContentValues a ( com.orange.oab.contactless.packid.domain.Transaction p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* new-instance p1, Landroid/content/ContentValues; */
	 /* invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V */
	 /* .line 3 */
	 v0 = this.c;
	 (( com.orange.oab.contactless.packid.domain.Transaction ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getId()Ljava/lang/String;
	 final String v1 = "id"; // const-string v1, "id"
	 (( android.content.ContentValues ) p1 ).put ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 4 */
	 v0 = this.c;
	 (( com.orange.oab.contactless.packid.domain.Transaction ) v0 ).getZoneId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getZoneId()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 final String v1 = "zoneId"; // const-string v1, "zoneId"
	 (( android.content.ContentValues ) p1 ).put ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 5 */
	 v0 = this.c;
	 (( com.orange.oab.contactless.packid.domain.Transaction ) v0 ).getDate ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDate()Ljava/util/Date;
	 (( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v0 */
	 java.lang.Long .valueOf ( v0,v1 );
	 final String v1 = "transactionDate"; // const-string v1, "transactionDate"
	 (( android.content.ContentValues ) p1 ).put ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
	 /* .line 6 */
	 v0 = this.c;
	 (( com.orange.oab.contactless.packid.domain.Transaction ) v0 ).getAmountInCents ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getAmountInCents()Ljava/lang/Integer;
	 final String v1 = "amountInCents"; // const-string v1, "amountInCents"
	 (( android.content.ContentValues ) p1 ).put ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
	 /* .line 7 */
	 v0 = this.c;
	 (( com.orange.oab.contactless.packid.domain.Transaction ) v0 ).getDescription ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDescription()Ljava/lang/String;
	 final String v1 = "description"; // const-string v1, "description"
	 (( android.content.ContentValues ) p1 ).put ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
} // .end method
public android.content.ContentValues a ( java.lang.Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Lcom/orange/oab/contactless/packid/domain/Transaction; */
	 (( e.h.d.a.a.s.y ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/y;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/content/ContentValues;
} // .end method
