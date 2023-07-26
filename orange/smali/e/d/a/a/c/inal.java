public class inal {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.net.URL g;
	 /* # instance fields */
	 public final java.lang.String a;
	 public final Boolean b;
	 public final java.util.Set c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/d/a/a/c/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.Date d;
public final Boolean e;
public final java.util.Set f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Ljava/net/URL;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static inal ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Ljava/net/URL; */
final String v1 = "https://overmind.datatheorem.com/trustkit/report"; // const-string v1, "https://overmind.datatheorem.com/trustkit/report"
/* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2 */
return;
/* .line 3 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Bad DEFAULT_REPORTING_URL"; // const-string v1, "Bad DEFAULT_REPORTING_URL"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public inal ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Boolean;", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/Boolean;", */
/* "Ljava/util/Date;", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/Boolean;", */
/* ")V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException; */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.d.a.a.c.d .a ( );
/* .line 3 */
v0 = (( e.d.a.a.c.d ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/d/a/a/c/d;->b(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 4 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
this.a = p1;
/* if-nez p3, :cond_0 */
/* .line 5 */
/* new-instance p3, Ljava/util/HashSet; */
/* invoke-direct {p3}, Ljava/util/HashSet;-><init>()V */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* if-nez p4, :cond_1 */
/* .line 6 */
/* iput-boolean p1, p0, Le/d/a/a/c/b;->e:Z */
/* .line 7 */
} // :cond_1
p4 = (( java.lang.Boolean ) p4 ).booleanValue ( ); // invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean p4, p0, Le/d/a/a/c/b;->e:Z */
} // :goto_0
/* if-nez p2, :cond_2 */
/* .line 8 */
/* iput-boolean p1, p0, Le/d/a/a/c/b;->b:Z */
/* .line 9 */
} // :cond_2
p1 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean p1, p0, Le/d/a/a/c/b;->b:Z */
/* .line 10 */
p1 = } // :goto_1
if ( p1 != null) { // if-eqz p1, :cond_4
/* iget-boolean p1, p0, Le/d/a/a/c/b;->e:Z */
/* if-nez p1, :cond_3 */
/* .line 11 */
} // :cond_3
/* new-instance p1, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "An empty pin-set was supplied for domain "; // const-string p3, "An empty pin-set was supplied for domain "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p3 = this.a;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = " with the enforcePinning set to true.An empty pin-set disables pinning and can\'t be use with enforcePinning set to true."; // const-string p3, " with the enforcePinning set to true.An empty pin-set disables pinning and can\'t be use with enforcePinning set to true."
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 12 */
} // :cond_4
p1 = } // :goto_2
int p2 = 2; // const/4 p2, 0x2
/* if-ge p1, p2, :cond_6 */
/* iget-boolean p1, p0, Le/d/a/a/c/b;->e:Z */
/* if-nez p1, :cond_5 */
/* .line 13 */
} // :cond_5
/* new-instance p1, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Less than two pins were supplied for domain "; // const-string p3, "Less than two pins were supplied for domain "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p3 = this.a;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = ".This might brick your App; please review the Getting Started guide in ./docs/getting-started.md"; // const-string p3, ".This might brick your App; please review the Getting Started guide in ./docs/getting-started.md"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 14 */
} // :cond_6
} // :goto_3
/* new-instance p1, Ljava/util/HashSet; */
/* invoke-direct {p1}, Ljava/util/HashSet;-><init>()V */
this.c = p1;
/* .line 15 */
p2 = } // :goto_4
if ( p2 != null) { // if-eqz p2, :cond_7
/* check-cast p2, Ljava/lang/String; */
/* .line 16 */
p3 = this.c;
/* new-instance p4, Le/d/a/a/c/e; */
/* invoke-direct {p4, p2}, Le/d/a/a/c/e;-><init>(Ljava/lang/String;)V */
/* .line 17 */
} // :cond_7
/* new-instance p1, Ljava/util/HashSet; */
/* invoke-direct {p1}, Ljava/util/HashSet;-><init>()V */
this.f = p1;
if ( p6 != null) { // if-eqz p6, :cond_8
/* .line 18 */
p2 = } // :goto_5
if ( p2 != null) { // if-eqz p2, :cond_8
/* check-cast p2, Ljava/lang/String; */
/* .line 19 */
p3 = this.f;
/* new-instance p4, Ljava/net/URL; */
/* invoke-direct {p4, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
} // :cond_8
if ( p7 != null) { // if-eqz p7, :cond_9
/* .line 20 */
p1 = (( java.lang.Boolean ) p7 ).booleanValue ( ); // invoke-virtual {p7}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p1, :cond_a */
/* .line 21 */
} // :cond_9
p1 = this.f;
p2 = e.d.a.a.c.b.g;
/* .line 22 */
} // :cond_a
this.d = p5;
return;
/* .line 23 */
} // :cond_b
/* new-instance p2, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String p4 = "Tried to pin an invalid domain: "; // const-string p4, "Tried to pin an invalid domain: "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
/* # virtual methods */
public java.util.Date a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public java.util.Set c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Le/d/a/a/c/e;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
} // .end method
public java.util.Set d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/net/URL;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.f;
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/d/a/a/c/b;->e:Z */
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/d/a/a/c/b;->b:Z */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "DomainPinningPolicy{hostname = "; // const-string v1, "DomainPinningPolicy{hostname = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\nknownPins = "; // const-string v1, "\nknownPins = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
/* .line 2 */
java.util.Arrays .toString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\nshouldEnforcePinning = "; // const-string v1, "\nshouldEnforcePinning = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Le/d/a/a/c/b;->e:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = "\nreportUris = "; // const-string v1, "\nreportUris = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "\nshouldIncludeSubdomains = "; // const-string v1, "\nshouldIncludeSubdomains = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Le/d/a/a/c/b;->b:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = "\n}"; // const-string v1, "\n}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
