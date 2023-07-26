public class e.d.a.a.e.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 public final android.content.Context d;
	 /* # direct methods */
	 public e.d.a.a.e.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.d = p1;
		 /* .line 3 */
		 this.a = p2;
		 /* .line 4 */
		 this.b = p3;
		 /* .line 5 */
		 this.c = p4;
		 return;
	 } // .end method
	 public static java.lang.String a ( java.security.cert.X509Certificate p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 try { // :try_start_0
			 (( java.security.cert.X509Certificate ) p0 ).getEncoded ( ); // invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getEncoded()[B
			 /* :try_end_0 */
			 /* .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 2 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "-----BEGIN CERTIFICATE-----\n"; // const-string v1, "-----BEGIN CERTIFICATE-----\n"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 int v1 = 0; // const/4 v1, 0x0
			 android.util.Base64 .encodeToString ( p0,v1 );
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 3 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String p0 = "-----END CERTIFICATE-----\n"; // const-string p0, "-----END CERTIFICATE-----\n"
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 4 */
			 /* :catch_0 */
			 /* new-instance p0, Ljava/lang/IllegalStateException; */
			 final String v0 = "Should never happen - certificate was previously parsed by the system"; // const-string v0, "Should never happen - certificate was previously parsed by the system"
			 /* invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
		 } // .end method
		 /* # virtual methods */
		 public void a ( Object p0 ) {
			 /* .locals 2 */
			 /* .line 26 */
			 /* new-instance v0, Landroid/content/Intent; */
			 final String v1 = "com.datatheorem.android.trustkit.reporting.BackgroundReporter:REPORT_VALIDATION_EVENT"; // const-string v1, "com.datatheorem.android.trustkit.reporting.BackgroundReporter:REPORT_VALIDATION_EVENT"
			 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
			 final String v1 = "Report"; // const-string v1, "Report"
			 /* .line 27 */
			 (( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
			 /* .line 28 */
			 p1 = this.d;
			 c.p.a.d .a ( p1 );
			 (( c.p.a.d ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z
			 return;
		 } // .end method
		 public void a ( Object p0, java.util.Set p1 ) {
			 /* .locals 1 */
			 /* .annotation system Ldalvik/annotation/Signature; */
			 /* value = { */
			 /* "(", */
			 /* "Le/d/a/a/e/c;", */
			 /* "Ljava/util/Set<", */
			 /* "Ljava/net/URL;", */
			 /* ">;)V" */
			 /* } */
		 } // .end annotation
		 /* .line 22 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* .line 23 */
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* .line 24 */
		 (( java.util.ArrayList ) v0 ).addAll ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
		 /* .line 25 */
		 /* new-instance p1, Le/d/a/a/e/b; */
		 /* invoke-direct {p1}, Le/d/a/a/e/b;-><init>()V */
		 (( java.util.ArrayList ) v0 ).toArray ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
		 (( android.os.AsyncTask ) p1 ).execute ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
		 return;
	 } // .end method
	 public void a ( java.lang.String p0, java.lang.Integer p1, java.util.List p2, java.util.List p3, Object p4, Object p5 ) {
		 /* .locals 16 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Integer;", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/security/cert/X509Certificate;", */
		 /* ">;", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/security/cert/X509Certificate;", */
		 /* ">;", */
		 /* "Le/d/a/a/c/b;", */
		 /* "Le/d/a/a/d/e;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* move-object/from16 v0, p0 */
	 /* move-object/from16 v15, p1 */
	 /* .line 5 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Generating pin failure report for "; // const-string v2, "Generating pin failure report for "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v15 ); // invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 e.d.a.a.f.a .a ( v1 );
	 /* .line 6 */
	 /* new-instance v11, Ljava/util/ArrayList; */
	 /* invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V */
	 /* .line 7 */
	 /* invoke-interface/range {p4 ..p4}, Ljava/util/List;->iterator()Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* check-cast v2, Ljava/security/cert/X509Certificate; */
	 /* .line 8 */
	 e.d.a.a.e.a .a ( v2 );
	 (( java.util.ArrayList ) v11 ).add ( v2 ); // invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 /* .line 9 */
} // :cond_0
/* new-instance v10, Ljava/util/ArrayList; */
/* invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V */
/* .line 10 */
/* invoke-interface/range {p3 ..p3}, Ljava/util/List;->iterator()Ljava/util/Iterator; */
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/security/cert/X509Certificate; */
/* .line 11 */
e.d.a.a.e.a .a ( v2 );
(( java.util.ArrayList ) v10 ).add ( v2 ); // invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 12 */
} // :cond_1
/* new-instance v14, Le/d/a/a/e/c; */
v2 = this.a;
v3 = this.b;
v4 = this.c;
/* .line 13 */
v6 = /* invoke-virtual/range {p2 ..p2}, Ljava/lang/Integer;->intValue()I */
/* .line 14 */
/* invoke-virtual/range {p5 ..p5}, Le/d/a/a/c/b;->b()Ljava/lang/String; */
v8 = /* invoke-virtual/range {p5 ..p5}, Le/d/a/a/c/b;->f()Z */
/* .line 15 */
v9 = /* invoke-virtual/range {p5 ..p5}, Le/d/a/a/c/b;->e()Z */
/* new-instance v12, Ljava/sql/Date; */
/* .line 16 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* invoke-direct {v12, v0, v1}, Ljava/sql/Date;-><init>(J)V */
/* .line 17 */
/* invoke-virtual/range {p5 ..p5}, Le/d/a/a/c/b;->c()Ljava/util/Set; */
/* move-object v1, v14 */
/* move-object/from16 v5, p1 */
/* move-object v0, v14 */
/* move-object/from16 v14, p6 */
/* invoke-direct/range {v1 ..v14}, Le/d/a/a/e/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Set;Le/d/a/a/d/e;)V */
/* .line 18 */
v1 = e.d.a.a.e.d .a ( v0 );
/* if-nez v1, :cond_2 */
/* .line 19 */
/* invoke-virtual/range {p5 ..p5}, Le/d/a/a/c/b;->d()Ljava/util/Set; */
/* move-object/from16 v2, p0 */
(( e.d.a.a.e.a ) v2 ).a ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Le/d/a/a/e/a;->a(Le/d/a/a/e/c;Ljava/util/Set;)V
/* .line 20 */
(( e.d.a.a.e.a ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Le/d/a/a/e/a;->a(Le/d/a/a/e/c;)V
} // :cond_2
/* move-object/from16 v2, p0 */
/* .line 21 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Report for "; // const-string v1, "Report for "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v15 ); // invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " was not sent due to rate-limiting"; // const-string v1, " was not sent due to rate-limiting"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.d.a.a.f.a .a ( v0 );
} // :goto_2
return;
} // .end method
