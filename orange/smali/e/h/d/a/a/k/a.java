public class e.h.d.a.a.k.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.k.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean a ( com.orange.oab.contactless.packid.hce.user.TokenData p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 11 */
			 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p0 ).getApplicationData ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p0 ).getApplicationData ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;
				 p0 = 				 (( fr.mbs.binary.Octets ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->isEmpty()Z
				 /* if-nez p0, :cond_0 */
				 int p0 = 1; // const/4 p0, 0x1
			 } // :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // :goto_0
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.domain.Transaction a ( fr.mbs.binary.Octets p0, com.orange.oab.contactless.packid.hce.user.TokenData p1, com.orange.oab.contactless.packid.hce.user.TokenData p2 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException;, */
		 /* Lcom/orange/oab/contactless/packid/domain/a;, */
		 /* Lcom/orange/oab/contactless/packid/domain/b; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).getApplicationData ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;
	 com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData .parse ( v0 );
	 /* .line 2 */
	 v1 = 	 e.h.d.a.a.k.a .a ( p3 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p3 ).getApplicationData ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;
		 com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData .parse ( v1 );
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 3 */
} // :goto_0
p2 = (( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).equals ( p3 ); // invoke-virtual {p2, p3}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->equals(Ljava/lang/Object;)Z
/* if-nez p2, :cond_2 */
/* .line 4 */
(( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) v0 ).getLastTransactionType ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getLastTransactionType()Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
p3 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.INIT;
/* if-eq p2, p3, :cond_1 */
/* .line 5 */
p2 = (( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) v0 ).calculateAmount ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->calculateAmount(Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;)I
/* .line 6 */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "n\u00b0"; // const-string v1, "n\u00b0"
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) v0 ).getReaderNumber ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getReaderNumber()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 7 */
(( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) v0 ).getLastDate ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getLastDate()Ljava/util/Date;
/* .line 8 */
/* new-instance v1, Lcom/orange/oab/contactless/packid/domain/Transaction; */
java.lang.Integer .valueOf ( p2 );
/* invoke-direct {v1, p1, p3, v0, p2}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V */
/* .line 9 */
} // :cond_1
/* new-instance p1, Lcom/orange/oab/contactless/packid/domain/b; */
/* invoke-direct {p1}, Lcom/orange/oab/contactless/packid/domain/b;-><init>()V */
/* throw p1 */
/* .line 10 */
} // :cond_2
/* new-instance p1, Lcom/orange/oab/contactless/packid/domain/a; */
/* invoke-direct {p1}, Lcom/orange/oab/contactless/packid/domain/a;-><init>()V */
/* throw p1 */
} // .end method
