public class org.apache.log4j.helpers.Transform {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer a;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.Transform ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.Transform ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void appendEscapingCDATA ( java.lang.StringBuffer p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 if ( p1 != null) { // if-eqz p1, :cond_3
			 final String v0 = "]]>"; // const-string v0, "]]>"
			 /* .line 1 */
			 v1 = 			 (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
			 /* if-gez v1, :cond_0 */
			 /* .line 2 */
			 (( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 } // :cond_0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 int v3 = -1; // const/4 v3, -0x1
	 /* if-le v1, v3, :cond_2 */
	 /* .line 3 */
	 (( java.lang.String ) p1 ).substring ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
	 (( java.lang.StringBuffer ) p0 ).append ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v2 = "]]>]]&gt;<![CDATA["; // const-string v2, "]]>]]&gt;<![CDATA["
	 /* .line 4 */
	 (( java.lang.StringBuffer ) p0 ).append ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 5 */
	 /* add-int/2addr v2, v1 */
	 /* .line 6 */
	 v1 = 	 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
	 /* if-ge v2, v1, :cond_1 */
	 /* .line 7 */
	 v1 = 	 (( java.lang.String ) p1 ).indexOf ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
} // :cond_1
return;
/* .line 8 */
} // :cond_2
(( java.lang.String ) p1 ).substring ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_3
} // :goto_1
return;
} // .end method
public static java.lang.String escapeTags ( java.lang.String p0 ) {
/* .locals 8 */
if ( p0 != null) { // if-eqz p0, :cond_7
/* .line 1 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_7
/* const/16 v0, 0x22 */
v1 = (( java.lang.String ) p0 ).indexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I
/* const/16 v2, 0x3c */
/* const/16 v3, 0x26 */
/* const/16 v4, 0x3e */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v1, v5, :cond_0 */
v1 = (( java.lang.String ) p0 ).indexOf ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I
/* if-ne v1, v5, :cond_0 */
v1 = (( java.lang.String ) p0 ).indexOf ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I
/* if-ne v1, v5, :cond_0 */
v1 = (( java.lang.String ) p0 ).indexOf ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I
/* if-ne v1, v5, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuffer; */
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, 0x6 */
/* invoke-direct {v1, v5}, Ljava/lang/StringBuffer;-><init>(I)V */
/* .line 3 */
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v6, v5, :cond_6 */
/* .line 4 */
v7 = (( java.lang.String ) p0 ).charAt ( v6 ); // invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C
/* if-le v7, v4, :cond_1 */
/* .line 5 */
(( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_1
/* if-ne v7, v2, :cond_2 */
final String v7 = "&lt;"; // const-string v7, "&lt;"
/* .line 6 */
(( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_2
/* if-ne v7, v4, :cond_3 */
final String v7 = "&gt;"; // const-string v7, "&gt;"
/* .line 7 */
(( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_3
/* if-ne v7, v3, :cond_4 */
final String v7 = "&amp;"; // const-string v7, "&amp;"
/* .line 8 */
(( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_4
/* if-ne v7, v0, :cond_5 */
final String v7 = "&quot;"; // const-string v7, "&quot;"
/* .line 9 */
(( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 10 */
} // :cond_5
(( java.lang.StringBuffer ) v1 ).append ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :goto_1
/* add-int/lit8 v6, v6, 0x1 */
/* .line 11 */
} // :cond_6
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_7
} // :goto_2
} // .end method
