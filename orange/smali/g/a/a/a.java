public class g.a.a.a extends fr.mbs.binary.Octets implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final g.a.a.a e;
	 /* # instance fields */
	 public Object d;
	 /* # direct methods */
	 public static g.a.a.a ( ) {
		 /* .locals 1 */
		 final String v0 = "00"; // const-string v0, "00"
		 /* .line 1 */
		 g.a.a.a .a ( v0 );
		 return;
	 } // .end method
	 public g.a.a.a ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-byte v0, p0, Lg/a/a/a;->d:B */
		 return;
	 } // .end method
	 public g.a.a.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V */
		 /* .line 2 */
		 /* iput-byte p1, p0, Lg/a/a/a;->d:B */
		 return;
	 } // .end method
	 public g.a.a.a ( ) {
		 /* .locals 0 */
		 /* .line 5 */
		 /* invoke-direct {p0}, Lfr/mbs/binary/Octets;-><init>()V */
		 /* .line 6 */
		 /* iget-byte p1, p1, Lg/a/a/a;->d:B */
		 /* iput-byte p1, p0, Lg/a/a/a;->d:B */
		 return;
	 } // .end method
	 public static g.a.a.a a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* new-instance v0, Lg/a/a/a; */
		 /* invoke-direct {v0, p0}, Lg/a/a/a;-><init>(B)V */
	 } // .end method
	 public static g.a.a.a a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 final String v0 = "[0-9A-Fa-f]{2}"; // const-string v0, "[0-9A-Fa-f]{2}"
		 /* .line 1 */
		 v0 = 		 (( java.lang.String ) p0 ).matches ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* const/16 v0, 0x10 */
			 /* .line 2 */
			 p0 = 			 java.lang.Integer .parseInt ( p0,v0 );
			 g.a.a.a .b ( p0 );
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance v0, Lfr/mbs/binary/OctetRuntimeException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Hexadecimal String value error: "; // const-string v2, "Hexadecimal String value error: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String p0 = " expecting two chars from 0 to 9, A to F or a to f string"; // const-string p0, " expecting two chars from 0 to 9, A to F or a to f string"
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, p0}, Lfr/mbs/binary/OctetRuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // .end method
	 public static g.a.a.a b ( Integer p0 ) {
		 /* .locals 0 */
		 /* int-to-byte p0, p0 */
		 /* .line 1 */
		 g.a.a.a .a ( p0 );
	 } // .end method
	 /* # virtual methods */
	 public Object a ( ) {
		 /* .locals 1 */
		 /* .line 5 */
		 /* iget-byte v0, p0, Lg/a/a/a;->d:B */
	 } // .end method
	 public Integer a ( Integer p0 ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-lt p1, v0, :cond_1 */
		 /* const/16 v1, 0x8 */
		 /* if-lt v1, p1, :cond_1 */
		 /* .line 6 */
		 /* iget-byte v2, p0, Lg/a/a/a;->d:B */
		 /* sub-int/2addr v1, p1 */
		 /* shr-int p1, v2, v1 */
		 /* int-to-byte p1, p1 */
		 /* and-int/2addr p1, v0 */
		 /* if-ne p1, v0, :cond_0 */
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 7 */
} // :cond_1
/* new-instance v0, Lfr/mbs/binary/OctetRuntimeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Requested "; // const-string v2, "Requested "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = "th bit, index should be between 1 and 8"; // const-string p1, "th bit, index should be between 1 and 8"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Lfr/mbs/binary/OctetRuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Object b ( ) {
/* .locals 1 */
/* .line 2 */
/* iget-byte v0, p0, Lg/a/a/a;->d:B */
/* and-int/lit16 v0, v0, 0xff */
/* int-to-short v0, v0 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Lg/a/a/a; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-byte v0, p0, Lg/a/a/a;->d:B */
	 /* check-cast p1, Lg/a/a/a; */
	 /* iget-byte p1, p1, Lg/a/a/a;->d:B */
	 /* if-ne v0, p1, :cond_0 */
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-byte v0, p0, Lg/a/a/a;->d:B */
} // .end method
public java.lang.String toBitsString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
/* const/16 v2, 0x8 */
/* if-gt v1, v2, :cond_0 */
/* .line 2 */
v2 = (( g.a.a.a ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lg/a/a/a;->a(I)I
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* add-int/lit8 v1, v1, 0x1 */
/* .line 3 */
} // :cond_0
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
/* iget-byte v1, p0, Lg/a/a/a;->d:B */
java.lang.Byte .valueOf ( v1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
final String v1 = "%02X"; // const-string v1, "%02X"
java.lang.String .format ( v1,v0 );
} // .end method
public java.lang.String toString ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 2 */
(( g.a.a.a ) p0 ).toString ( ); // invoke-virtual {p0}, Lg/a/a/a;->toString()Ljava/lang/String;
} // .end method
