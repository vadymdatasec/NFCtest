public class com.orange.oab.contactless.packid.hce.user.TokenData implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer b;
	 public final fr.mbs.binary.Octets c;
	 public final java.util.Date d;
	 public final Integer e;
	 public final fr.mbs.binary.Octets f;
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.hce.user.TokenData ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I */
		 /* .line 3 */
		 this.c = p2;
		 /* .line 4 */
		 this.d = p3;
		 /* .line 5 */
		 /* iput p4, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I */
		 /* .line 6 */
		 this.f = p5;
		 return;
	 } // .end method
	 public static java.text.DateFormat a ( ) {
		 /* .locals 4 */
		 final String v0 = "UTC"; // const-string v0, "UTC"
		 /* .line 1 */
		 java.util.TimeZone .getTimeZone ( v0 );
		 /* .line 2 */
		 /* new-instance v1, Ljava/text/SimpleDateFormat; */
		 v2 = java.util.Locale.US;
		 final String v3 = "yyyyMMddHHmmss"; // const-string v3, "yyyyMMddHHmmss"
		 /* invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
		 /* .line 3 */
		 (( java.text.DateFormat ) v1 ).setTimeZone ( v0 ); // invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
	 } // .end method
	 public static com.orange.oab.contactless.packid.hce.user.TokenData create ( fr.mbs.binary.Octets p0, java.util.Date p1, fr.mbs.binary.Octets p2 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* new-instance v6, Lcom/orange/oab/contactless/packid/hce/user/TokenData; */
		 int v1 = 1; // const/4 v1, 0x1
		 int v4 = 2; // const/4 v4, 0x2
		 /* move-object v0, v6 */
		 /* move-object v2, p0 */
		 /* move-object v3, p1 */
		 /* move-object v5, p2 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;-><init>(ILfr/mbs/binary/Octets;Ljava/util/Date;ILfr/mbs/binary/Octets;)V */
	 } // .end method
	 public static com.orange.oab.contactless.packid.hce.user.TokenData parse ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 fr.mbs.binary.Octets .createOctets ( p0 );
		 int p0 = 1; // const/4 p0, 0x1
		 /* .line 2 */
		 (( fr.mbs.binary.Octets ) v5 ).pop ( p0 ); // invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
		 v1 = 		 (( fr.mbs.binary.Octets ) p0 ).toInt ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toInt()I
		 /* const/16 p0, 0xa */
		 /* .line 3 */
		 (( fr.mbs.binary.Octets ) v5 ).pop ( p0 ); // invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
		 int p0 = 7; // const/4 p0, 0x7
		 /* .line 4 */
		 (( fr.mbs.binary.Octets ) v5 ).pop ( p0 ); // invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
		 com.orange.oab.contactless.packid.hce.user.TokenData .parseDate ( p0 );
		 int p0 = 2; // const/4 p0, 0x2
		 /* .line 5 */
		 (( fr.mbs.binary.Octets ) v5 ).pop ( p0 ); // invoke-virtual {v5, p0}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
		 v4 = 		 (( fr.mbs.binary.Octets ) p0 ).toInt ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toInt()I
		 /* .line 6 */
		 /* new-instance p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData; */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;-><init>(ILfr/mbs/binary/Octets;Ljava/util/Date;ILfr/mbs/binary/Octets;)V */
	 } // .end method
	 public static java.util.Date parseDate ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 try { // :try_start_0
			 com.orange.oab.contactless.packid.hce.user.TokenData .a ( );
			 (( fr.mbs.binary.Octets ) p0 ).toHexa ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
			 (( java.text.DateFormat ) v0 ).parse ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
			 /* :try_end_0 */
			 /* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 /* .line 2 */
			 /* new-instance v0, Ljava/lang/RuntimeException; */
			 final String v1 = "Could not parse token date"; // const-string v1, "Could not parse token date"
			 /* invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
			 /* throw v0 */
		 } // .end method
		 /* # virtual methods */
		 public Boolean equals ( java.lang.Object p0 ) {
			 /* .locals 2 */
			 /* if-ne p0, p1, :cond_0 */
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 1 */
			 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 /* const-class v1, Lcom/orange/oab/contactless/packid/hce/user/TokenData; */
			 /* if-eq v1, v0, :cond_1 */
			 /* .line 2 */
		 } // :cond_1
		 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/TokenData; */
		 /* .line 3 */
		 v0 = this.f;
		 p1 = this.f;
		 p1 = 		 java.util.Objects .equals ( v0,p1 );
	 } // :cond_2
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer getApiVersionNumber ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I */
} // .end method
public fr.mbs.binary.Octets getApplicationData ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public java.util.Date getExpirationDate ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public fr.mbs.binary.Octets getId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public Integer getSequenceNumber ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I */
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
v1 = this.f;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v0 = java.util.Objects .hash ( v0 );
} // .end method
public java.lang.String toHexa ( ) {
/* .locals 1 */
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p0 ).toOctets ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // .end method
public fr.mbs.binary.Octets toOctets ( ) {
/* .locals 3 */
/* .line 1 */
fr.mbs.binary.Octets .empty ( );
/* iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I */
/* .line 2 */
g.a.a.a .b ( v1 );
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
v1 = this.c;
/* .line 3 */
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 4 */
com.orange.oab.contactless.packid.hce.user.TokenData .a ( );
v2 = this.d;
(( java.text.DateFormat ) v1 ).format ( v2 ); // invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
fr.mbs.binary.Octets .createOctets ( v1 );
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I */
/* .line 5 */
java.lang.Integer .valueOf ( v1 );
int v2 = 2; // const/4 v2, 0x2
fr.mbs.binary.Octets .createOctets ( v2,v1 );
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
v1 = this.f;
/* .line 6 */
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
e.f.b.a.j .a ( p0 );
/* iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->b:I */
final String v2 = "apiVersionNumber"; // const-string v2, "apiVersionNumber"
/* .line 2 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;
v1 = this.c;
final String v2 = "id"; // const-string v2, "id"
/* .line 3 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
v1 = this.d;
final String v2 = "expirationDate"; // const-string v2, "expirationDate"
/* .line 4 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
/* iget v1, p0, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->e:I */
final String v2 = "sequenceNumber"; // const-string v2, "sequenceNumber"
/* .line 5 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;
v1 = this.f;
final String v2 = "applicationData"; // const-string v2, "applicationData"
/* .line 6 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
/* .line 7 */
(( e.f.b.a.j$a ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;
} // .end method
