public abstract class e.f.b.a.q {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( java.lang.Object p0 ) {
		 /* .locals 6 */
		 /* if-nez p0, :cond_0 */
		 final String p0 = "null"; // const-string p0, "null"
		 /* .line 28 */
	 } // :cond_0
	 try { // :try_start_0
		 (( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 29 */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 p0 = 		 java.lang.System .identityHashCode ( p0 );
		 java.lang.Integer .toHexString ( p0 );
		 java.lang.String .valueOf ( v1 );
		 v2 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v2, v2, 0x1 */
		 java.lang.String .valueOf ( p0 );
		 v3 = 		 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
		 /* add-int/2addr v2, v3 */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* const/16 v1, 0x40 */
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "com.google.common.base.Strings"; // const-string v1, "com.google.common.base.Strings"
		 /* .line 30 */
		 java.util.logging.Logger .getLogger ( v1 );
		 v2 = java.util.logging.Level.WARNING;
		 final String v3 = "Exception during lenientFormat for "; // const-string v3, "Exception during lenientFormat for "
		 java.lang.String .valueOf ( p0 );
		 v5 = 		 (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
		 if ( v5 != null) { // if-eqz v5, :cond_1
			 (( java.lang.String ) v3 ).concat ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_1
		 /* new-instance v4, Ljava/lang/String; */
		 /* invoke-direct {v4, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
		 /* move-object v3, v4 */
		 /* .line 31 */
	 } // :goto_0
	 (( java.util.logging.Logger ) v1 ).log ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
	 /* .line 32 */
	 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 java.lang.String .valueOf ( p0 );
	 v1 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v1, v1, 0x9 */
	 java.lang.String .valueOf ( v0 );
	 v2 = 	 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
	 /* add-int/2addr v1, v2 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
	 final String v1 = "<"; // const-string v1, "<"
	 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p0 = " threw "; // const-string p0, " threw "
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p0 = ">"; // const-string p0, ">"
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.lang.String p0, Integer p1 ) {
	 /* .locals 7 */
	 /* .line 2 */
	 e.f.b.a.p .a ( p0 );
	 int v0 = 1; // const/4 v0, 0x1
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-gt p1, v0, :cond_2 */
	 /* if-ltz p1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
final String v1 = "invalid count: %s"; // const-string v1, "invalid count: %s"
/* .line 3 */
e.f.b.a.p .a ( v0,v1,p1 );
/* if-nez p1, :cond_1 */
final String p0 = ""; // const-string p0, ""
} // :cond_1
/* .line 4 */
} // :cond_2
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* int-to-long v2, v0 */
/* int-to-long v4, p1 */
/* mul-long v2, v2, v4 */
/* long-to-int p1, v2 */
/* int-to-long v4, p1 */
/* cmp-long v6, v4, v2 */
/* if-nez v6, :cond_4 */
/* .line 5 */
/* new-array v2, p1, [C */
/* .line 6 */
(( java.lang.String ) p0 ).getChars ( v1, v0, v2, v1 ); // invoke-virtual {p0, v1, v0, v2, v1}, Ljava/lang/String;->getChars(II[CI)V
} // :goto_1
/* sub-int p0, p1, v0 */
/* if-ge v0, p0, :cond_3 */
/* .line 7 */
java.lang.System .arraycopy ( v2,v1,v2,v0,v0 );
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 8 */
} // :cond_3
java.lang.System .arraycopy ( v2,v1,v2,v0,p0 );
/* .line 9 */
/* new-instance p0, Ljava/lang/String; */
/* invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V */
/* .line 10 */
} // :cond_4
/* new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* const/16 p1, 0x33 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "Required array size too large: "; // const-string p1, "Required array size too large: "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 6 */
/* .line 11 */
java.lang.String .valueOf ( p0 );
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* new-array p1, p1, [Ljava/lang/Object; */
final String v1 = "(Object[])null"; // const-string v1, "(Object[])null"
/* aput-object v1, p1, v0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 12 */
} // :goto_0
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_1 */
/* .line 13 */
/* aget-object v2, p1, v1 */
e.f.b.a.q .a ( v2 );
/* aput-object v2, p1, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 14 */
} // :cond_1
} // :goto_1
/* new-instance v1, Ljava/lang/StringBuilder; */
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* array-length v3, p1 */
/* mul-int/lit8 v3, v3, 0x10 */
/* add-int/2addr v2, v3 */
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
int v2 = 0; // const/4 v2, 0x0
/* .line 15 */
} // :goto_2
/* array-length v3, p1 */
/* if-ge v0, v3, :cond_3 */
final String v3 = "%s"; // const-string v3, "%s"
/* .line 16 */
v3 = (( java.lang.String ) p0 ).indexOf ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
int v4 = -1; // const/4 v4, -0x1
/* if-ne v3, v4, :cond_2 */
/* .line 17 */
} // :cond_2
(( java.lang.StringBuilder ) v1 ).append ( p0, v2, v3 ); // invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, v0, 0x1 */
/* .line 18 */
/* aget-object v0, p1, v0 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v3, 0x2 */
/* move v5, v2 */
/* move v2, v0 */
/* move v0, v5 */
/* .line 19 */
} // :cond_3
} // :goto_3
v3 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
(( java.lang.StringBuilder ) v1 ).append ( p0, v2, v3 ); // invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
/* .line 20 */
/* array-length p0, p1 */
/* if-ge v0, p0, :cond_5 */
final String p0 = " ["; // const-string p0, " ["
/* .line 21 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 p0, v0, 0x1 */
/* .line 22 */
/* aget-object v0, p1, v0 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 23 */
} // :goto_4
/* array-length v0, p1 */
/* if-ge p0, v0, :cond_4 */
final String v0 = ", "; // const-string v0, ", "
/* .line 24 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, p0, 0x1 */
/* .line 25 */
/* aget-object p0, p1, p0 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* move p0, v0 */
} // :cond_4
/* const/16 p0, 0x5d */
/* .line 26 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 27 */
} // :cond_5
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = e.f.b.a.o .a ( p0 );
} // .end method
