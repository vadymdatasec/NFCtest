public class com.orange.hce.proto.activity.LogActivity$b implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/hce/proto/activity/LogActivity;->z()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.orange.hce.proto.activity.LogActivity b; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.LogActivity$b ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 4 */
/* .line 1 */
p1 = this.b;
com.orange.hce.proto.activity.LogActivity .c ( p1 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "=== Log session finished on "; // const-string v1, "=== Log session finished on "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v1, Ljava/text/SimpleDateFormat; */
v2 = java.util.Locale.ENGLISH;
final String v3 = "HH:mm:ss yyyy/MM/dd"; // const-string v3, "HH:mm:ss yyyy/MM/dd"
/* invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
/* new-instance v2, Ljava/util/Date; */
/* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
(( java.text.SimpleDateFormat ) v1 ).format ( v2 ); // invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " ==="; // const-string v1, " ==="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.b.a.l.a1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
/* .line 2 */
p1 = this.b;
com.orange.hce.proto.activity.LogActivity .d ( p1 );
return;
} // .end method
