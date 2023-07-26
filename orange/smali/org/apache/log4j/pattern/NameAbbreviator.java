public abstract class org.apache.log4j.pattern.NameAbbreviator {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/pattern/NameAbbreviator$d;, */
	 /* Lorg/apache/log4j/pattern/NameAbbreviator$e;, */
	 /* Lorg/apache/log4j/pattern/NameAbbreviator$a;, */
	 /* Lorg/apache/log4j/pattern/NameAbbreviator$b;, */
	 /* Lorg/apache/log4j/pattern/NameAbbreviator$c; */
	 /* } */
} // .end annotation
/* # static fields */
public static final org.apache.log4j.pattern.NameAbbreviator a;
/* # direct methods */
public static org.apache.log4j.pattern.NameAbbreviator ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lorg/apache/log4j/pattern/NameAbbreviator$c; */
	 /* invoke-direct {v0}, Lorg/apache/log4j/pattern/NameAbbreviator$c;-><init>()V */
	 return;
} // .end method
public org.apache.log4j.pattern.NameAbbreviator ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static org.apache.log4j.pattern.NameAbbreviator getAbbreviator ( java.lang.String p0 ) {
	 /* .locals 8 */
	 /* .line 1 */
	 v0 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 /* if-lez v0, :cond_c */
	 /* .line 2 */
	 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
	 /* .line 3 */
	 v0 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 /* if-nez v0, :cond_0 */
	 /* .line 4 */
	 p0 = org.apache.log4j.pattern.NameAbbreviator.a;
	 /* .line 5 */
} // :cond_0
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* const/16 v1, 0x39 */
/* const/16 v2, 0x30 */
int v3 = 0; // const/4 v3, 0x0
/* if-lez v0, :cond_2 */
/* .line 6 */
v0 = (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
/* const/16 v4, 0x2d */
/* if-ne v0, v4, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
} // :goto_0
v4 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v0, v4, :cond_3 */
v4 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* if-lt v4, v2, :cond_3 */
v4 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* if-gt v4, v1, :cond_3 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
} // :cond_3
v4 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ne v0, v4, :cond_5 */
/* .line 9 */
p0 = java.lang.Integer .parseInt ( p0 );
/* if-ltz p0, :cond_4 */
/* .line 10 */
/* new-instance v0, Lorg/apache/log4j/pattern/NameAbbreviator$b; */
/* invoke-direct {v0, p0}, Lorg/apache/log4j/pattern/NameAbbreviator$b;-><init>(I)V */
/* .line 11 */
} // :cond_4
/* new-instance v0, Lorg/apache/log4j/pattern/NameAbbreviator$a; */
/* neg-int p0, p0 */
/* invoke-direct {v0, p0}, Lorg/apache/log4j/pattern/NameAbbreviator$a;-><init>(I)V */
/* .line 12 */
} // :cond_5
/* new-instance v0, Ljava/util/ArrayList; */
int v4 = 5; // const/4 v4, 0x5
/* invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V */
int v4 = 0; // const/4 v4, 0x0
/* .line 13 */
} // :goto_1
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v4, v5, :cond_b */
/* if-ltz v4, :cond_b */
/* .line 14 */
v5 = (( java.lang.String ) p0 ).charAt ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
/* const/16 v6, 0x2a */
/* if-ne v5, v6, :cond_6 */
/* const v5, 0x7fffffff */
} // :goto_2
/* add-int/lit8 v6, v4, 0x1 */
/* .line 15 */
} // :cond_6
v5 = (( java.lang.String ) p0 ).charAt ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
/* if-lt v5, v2, :cond_7 */
v5 = (( java.lang.String ) p0 ).charAt ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
/* if-gt v5, v1, :cond_7 */
/* .line 16 */
v5 = (( java.lang.String ) p0 ).charAt ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C
/* sub-int/2addr v5, v2 */
} // :cond_7
/* move v6, v4 */
int v5 = 0; // const/4 v5, 0x0
/* .line 17 */
} // :goto_3
v7 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ge v6, v7, :cond_8 */
/* .line 18 */
v6 = (( java.lang.String ) p0 ).charAt ( v6 ); // invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C
/* const/16 v7, 0x2e */
/* if-ne v6, v7, :cond_9 */
} // :cond_8
int v6 = 0; // const/4 v6, 0x0
/* .line 19 */
} // :cond_9
/* new-instance v7, Lorg/apache/log4j/pattern/NameAbbreviator$e; */
/* invoke-direct {v7, v5, v6}, Lorg/apache/log4j/pattern/NameAbbreviator$e;-><init>(IC)V */
(( java.util.ArrayList ) v0 ).add ( v7 ); // invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
final String v5 = "."; // const-string v5, "."
/* .line 20 */
v4 = (( java.lang.String ) p0 ).indexOf ( v5, v4 ); // invoke-virtual {p0, v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_a */
} // :cond_a
/* add-int/lit8 v4, v4, 0x1 */
/* .line 21 */
} // :cond_b
} // :goto_4
/* new-instance p0, Lorg/apache/log4j/pattern/NameAbbreviator$d; */
/* invoke-direct {p0, v0}, Lorg/apache/log4j/pattern/NameAbbreviator$d;-><init>(Ljava/util/List;)V */
/* .line 22 */
} // :cond_c
p0 = org.apache.log4j.pattern.NameAbbreviator.a;
} // .end method
public static org.apache.log4j.pattern.NameAbbreviator getDefaultAbbreviator ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.pattern.NameAbbreviator.a;
} // .end method
/* # virtual methods */
public abstract void abbreviate ( Integer p0, java.lang.StringBuffer p1 ) {
} // .end method
