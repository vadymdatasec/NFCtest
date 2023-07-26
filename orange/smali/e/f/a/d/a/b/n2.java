public abstract class e.f.a.d.a.b.n2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.regex.Pattern a;
	 /* # direct methods */
	 public static e.f.a.d.a.b.n2 ( ) {
		 /* .locals 1 */
		 final String v0 = "[0-9]+-(NAM|LFH)\\.dat"; // const-string v0, "[0-9]+-(NAM|LFH)\\.dat"
		 java.util.regex.Pattern .compile ( v0 );
		 return;
	 } // .end method
	 public static java.util.List a ( java.io.File p0, java.io.File p1 ) {
		 /* .locals 8 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/io/File;", */
		 /* "Ljava/io/File;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/io/File;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
v1 = e.f.a.d.a.b.m2.a;
(( java.io.File ) p1 ).listFiles ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_0 */
/* new-array p1, v1, [Ljava/io/File; */
} // :cond_0
/* array-length v2, p1 */
/* new-array v3, v2, [Ljava/io/File; */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v2, :cond_2 */
/* aget-object v5, p1, v4 */
(( java.io.File ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;
final String v7 = "-"; // const-string v7, "-"
(( java.lang.String ) v6 ).split ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* aget-object v6, v6, v1 */
v6 = java.lang.Integer .parseInt ( v6 );
/* array-length v7, p1 */
/* if-gt v6, v7, :cond_1 */
/* aget-object v7, v3, v6 */
/* if-nez v7, :cond_1 */
/* aput-object v5, v3, v6 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
/* new-instance p0, Le/f/a/d/a/b/t0; */
final String p1 = "Metadata folder ordering corrupt."; // const-string p1, "Metadata folder ordering corrupt."
/* invoke-direct {p0, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_2
/* move-object p1, v3 */
} // :goto_1
/* array-length v2, p1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* if-ge v3, v2, :cond_6 */
/* aget-object v4, p1, v3 */
(( java.io.File ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
final String v6 = "LFH"; // const-string v6, "LFH"
v5 = (( java.lang.String ) v5 ).contains ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v5 != null) { // if-eqz v5, :cond_5
/* new-instance v5, Ljava/io/FileInputStream; */
/* invoke-direct {v5, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
try { // :try_start_0
/* new-instance v4, Le/f/a/d/a/b/k0; */
/* invoke-direct {v4, v5}, Le/f/a/d/a/b/k0;-><init>(Ljava/io/InputStream;)V */
(( e.f.a.d.a.b.k0 ) v4 ).c ( ); // invoke-virtual {v4}, Le/f/a/d/a/b/k0;->c()Le/f/a/d/a/b/r2;
(( e.f.a.d.a.b.r2 ) v4 ).c ( ); // invoke-virtual {v4}, Le/f/a/d/a/b/r2;->c()Ljava/lang/String;
if ( v6 != null) { // if-eqz v6, :cond_4
/* new-instance v6, Ljava/io/File; */
(( e.f.a.d.a.b.r2 ) v4 ).c ( ); // invoke-virtual {v4}, Le/f/a/d/a/b/r2;->c()Ljava/lang/String;
/* invoke-direct {v6, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
v4 = (( java.io.File ) v6 ).exists ( ); // invoke-virtual {v6}, Ljava/io/File;->exists()Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
} // :cond_3
try { // :try_start_1
/* new-instance p0, Le/f/a/d/a/b/t0; */
int p1 = 1; // const/4 p1, 0x1
/* new-array p1, p1, [Ljava/lang/Object; */
(( java.io.File ) v6 ).getCanonicalPath ( ); // invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* aput-object v0, p1, v1 */
final String v0 = "Missing asset file %s during slice reconstruction."; // const-string v0, "Missing asset file %s during slice reconstruction."
java.lang.String .format ( v0,p1 );
/* invoke-direct {p0, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_4
/* new-instance p0, Le/f/a/d/a/b/t0; */
final String p1 = "Metadata files corrupt.Could not read local file header."; // const-string p1, "Metadata files corrupt.Could not read local file header."
/* invoke-direct {p0, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception p0 */
try { // :try_start_2
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* :catchall_1 */
/* move-exception p1 */
e.f.a.d.a.e.w .a ( p0,p1 );
} // :goto_3
/* throw p0 */
} // :cond_5
} // :goto_4
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_6
} // .end method
public static final Boolean a ( java.lang.String p0 ) { //synthethic
/* .locals 1 */
v0 = e.f.a.d.a.b.n2.a;
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
p0 = (( java.util.regex.Matcher ) p0 ).matches ( ); // invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z
} // .end method
