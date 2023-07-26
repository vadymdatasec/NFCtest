public class com.orange.hce.proto.activity.LogActivity$d extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/ScrollView;)Landroid/content/BroadcastReceiver; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final android.widget.TextView a; //synthetic
public final android.widget.ScrollView b; //synthetic
public final com.orange.hce.proto.activity.LogActivity c; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.LogActivity$d ( ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
this.a = p2;
this.b = p3;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 8 */
final String v0 = "LogServiceMessage"; // const-string v0, "LogServiceMessage"
/* .line 1 */
(( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "LogServiceTimeStamp"; // const-string v1, "LogServiceTimeStamp"
/* .line 2 */
(( android.content.Intent ) p2 ).getStringExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
final String v2 = "LogServiceShouldWrite"; // const-string v2, "LogServiceShouldWrite"
int v3 = 1; // const/4 v3, 0x1
/* .line 3 */
v2 = (( android.content.Intent ) p2 ).getBooleanExtra ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
java.lang.Boolean .valueOf ( v2 );
final String v3 = "LogServiceColor"; // const-string v3, "LogServiceColor"
/* const v4, -0xffff01 */
/* .line 4 */
p2 = (( android.content.Intent ) p2 ).getIntExtra ( v3, v4 ); // invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 5 */
v3 = this.a;
v3 = (( android.widget.TextView ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/widget/TextView;->getHeight()I
v4 = this.b;
v4 = (( android.widget.ScrollView ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/widget/ScrollView;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 6 */
v4 = this.c;
v5 = this.a;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.String ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "\n"; // const-string v7, "\n"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.orange.hce.proto.activity.LogActivity .a ( v4,v5,v6,p2 );
/* if-lez v3, :cond_0 */
/* .line 7 */
p2 = this.b;
p2 = (( android.widget.ScrollView ) p2 ).getScrollY ( ); // invoke-virtual {p2}, Landroid/widget/ScrollView;->getScrollY()I
/* int-to-float p2, p2 */
/* int-to-float v3, v3 */
/* const/high16 v4, 0x42c80000 # 100.0f */
p1 = com.orange.hce.proto.activity.LogActivity .a ( v4,p1 );
/* sub-float/2addr v3, p1 */
/* cmpl-float p1, p2, v3 */
/* if-ltz p1, :cond_0 */
/* .line 8 */
p1 = this.b;
/* const/16 p2, 0x82 */
(( android.widget.ScrollView ) p1 ).fullScroll ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->fullScroll(I)Z
/* .line 9 */
} // :cond_0
p1 = (( java.lang.Boolean ) v2 ).booleanValue ( ); // invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 10 */
p1 = this.c;
com.orange.hce.proto.activity.LogActivity .c ( p1 );
(( java.lang.String ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
(( e.h.b.a.l.a1 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V
} // :cond_1
return;
} // .end method
