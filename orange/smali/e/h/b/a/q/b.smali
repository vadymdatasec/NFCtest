.class public Le/h/b/a/q/b;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic b:Le/h/b/a/m/d;

.field public final synthetic c:Le/h/b/a/q/c;


# direct methods
.method public constructor <init>(Le/h/b/a/q/c;Le/h/b/a/m/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/b/a/q/b;->c:Le/h/b/a/q/c;

    iput-object p2, p0, Le/h/b/a/q/b;->b:Le/h/b/a/m/d;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/b/a/q/b;->b:Le/h/b/a/m/d;

    sget-object v1, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    invoke-virtual {v0, v1}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V

    .line 2
    iget-object v0, p0, Le/h/b/a/q/b;->c:Le/h/b/a/q/c;

    iget-object v0, v0, Le/h/b/a/q/c;->a:Lcom/orange/hce/proto/widget/PackIdWidgetService$b;

    invoke-static {v0}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    return-void
.end method
