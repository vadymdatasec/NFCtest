public class com.orange.hce.proto.widget.PackIdWidgetProvider$a extends java.util.TimerTask {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/i;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final e.h.b.a.m.d b; //synthetic
public final android.content.Context c; //synthetic
/* # direct methods */
public com.orange.hce.proto.widget.PackIdWidgetProvider$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p2;
this.c = p3;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v1 = e.h.b.a.m.i.d;
(( e.h.b.a.m.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V
/* .line 2 */
v0 = this.c;
(( android.content.Context ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
e.h.b.a.q.d .c ( v0 );
return;
} // .end method
