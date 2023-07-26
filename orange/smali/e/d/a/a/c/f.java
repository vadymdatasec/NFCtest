public class e.d.a.a.c.f implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.regex.Pattern b;
	 /* # direct methods */
	 public e.d.a.a.c.f ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Le/d/a/a/c/f;-><init>(Ljava/lang/String;Z)V */
		 return;
	 } // .end method
	 public e.d.a.a.c.f ( ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p1, v0, v1 */
		 /* .line 2 */
		 /* invoke-direct {p0, v0, p2}, Le/d/a/a/c/f;-><init>([Ljava/lang/String;Z)V */
		 return;
	 } // .end method
	 public e.d.a.a.c.f ( ) {
		 /* .locals 3 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_3
			 /* .line 4 */
			 /* array-length v0, p1 */
			 if ( v0 != null) { // if-eqz v0, :cond_3
				 /* .line 5 */
				 /* array-length v0, p1 */
				 /* new-array v0, v0, [Ljava/util/regex/Pattern; */
				 this.b = v0;
				 int v0 = 0; // const/4 v0, 0x0
				 if ( p2 != null) { // if-eqz p2, :cond_0
					 int p2 = 0; // const/4 p2, 0x0
				 } // :cond_0
				 int p2 = 2; // const/4 p2, 0x2
				 /* .line 6 */
			 } // :goto_0
			 /* array-length v1, p1 */
			 /* if-ge v0, v1, :cond_2 */
			 /* .line 7 */
			 /* aget-object v1, p1, v0 */
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* aget-object v1, p1, v0 */
				 v1 = 				 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 /* .line 8 */
					 v1 = this.b;
					 /* aget-object v2, p1, v0 */
					 java.util.regex.Pattern .compile ( v2,p2 );
					 /* aput-object v2, v1, v0 */
					 /* add-int/lit8 v0, v0, 0x1 */
					 /* .line 9 */
				 } // :cond_1
				 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
				 /* new-instance p2, Ljava/lang/StringBuilder; */
				 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v1 = "Regular expression["; // const-string v1, "Regular expression["
				 (( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
				 final String v0 = "] is missing"; // const-string v0, "] is missing"
				 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
				 /* throw p1 */
			 } // :cond_2
			 return;
			 /* .line 10 */
		 } // :cond_3
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "Regular expressions are missing"; // const-string p2, "Regular expressions are missing"
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p1, :cond_0 */
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 1 */
} // :goto_0
v2 = this.b;
/* array-length v3, v2 */
/* if-ge v1, v3, :cond_2 */
/* .line 2 */
/* aget-object v2, v2, v1 */
(( java.util.regex.Pattern ) v2 ).matcher ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v2 = (( java.util.regex.Matcher ) v2 ).matches ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z
if ( v2 != null) { // if-eqz v2, :cond_1
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // .end method
public java.lang.String b ( java.lang.String p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 1 */
} // :goto_0
v3 = this.b;
/* array-length v4, v3 */
/* if-ge v2, v4, :cond_3 */
/* .line 2 */
/* aget-object v3, v3, v2 */
(( java.util.regex.Pattern ) v3 ).matcher ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 3 */
v4 = (( java.util.regex.Matcher ) v3 ).matches ( ); // invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 4 */
p1 = (( java.util.regex.Matcher ) v3 ).groupCount ( ); // invoke-virtual {v3}, Ljava/util/regex/Matcher;->groupCount()I
/* .line 5 */
/* new-array v0, p1, [Ljava/lang/String; */
} // :goto_1
/* if-ge v1, p1, :cond_1 */
/* add-int/lit8 v2, v1, 0x1 */
/* .line 6 */
(( java.util.regex.Matcher ) v3 ).group ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
/* aput-object v4, v0, v1 */
/* move v1, v2 */
} // :cond_1
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "RegexValidator{"; // const-string v1, "RegexValidator{"
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = this.b;
/* array-length v2, v2 */
/* if-ge v1, v2, :cond_1 */
/* if-lez v1, :cond_0 */
final String v2 = ","; // const-string v2, ","
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
} // :cond_0
v2 = this.b;
/* aget-object v2, v2, v1 */
(( java.util.regex.Pattern ) v2 ).pattern ( ); // invoke-virtual {v2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
final String v1 = "}"; // const-string v1, "}"
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
