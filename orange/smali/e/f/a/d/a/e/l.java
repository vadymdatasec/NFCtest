public abstract class e.f.a.d.a.e.l {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( java.io.File p0 ) {
		 /* .locals 3 */
		 (( java.io.File ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v1 = ".apk"; // const-string v1, ".apk"
		 v0 = 		 (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 (( java.io.File ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
			 final String v0 = ""; // const-string v0, ""
			 final String v1 = "(_\\d+)?\\.apk"; // const-string v1, "(_\\d+)?\\.apk"
			 (( java.lang.String ) p0 ).replaceFirst ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
			 final String v1 = "base-master"; // const-string v1, "base-master"
			 v1 = 			 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
			 } // :cond_0
			 final String v1 = "base-"; // const-string v1, "base-"
			 v2 = 			 (( java.lang.String ) p0 ).startsWith ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
			 if ( v2 != null) { // if-eqz v2, :cond_1
				 final String v0 = "config."; // const-string v0, "config."
			 } // :goto_0
			 (( java.lang.String ) p0 ).replace ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 } // :cond_1
		 final String v1 = "-"; // const-string v1, "-"
		 final String v2 = ".config."; // const-string v2, ".config."
		 (( java.lang.String ) p0 ).replace ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 final String v1 = ".config.master"; // const-string v1, ".config.master"
	 } // :cond_2
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "Non-apk found in splits directory."; // const-string v0, "Non-apk found in splits directory."
	 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
public static void a ( java.lang.Object p0, java.lang.Object p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TT;", */
	 /* "Ljava/lang/Object;", */
	 /* ")V" */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
	 return;
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
/* check-cast p1, Ljava/lang/String; */
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.Object p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
	 return;
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
