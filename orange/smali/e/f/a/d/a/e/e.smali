.class public final Le/f/a/d/a/e/e;
.super Le/f/a/d/a/e/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Le/f/a/d/a/e/k;


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/k;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-direct {p0}, Le/f/a/d/a/e/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/k;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/k;)Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unbind from service."

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->d(Le/f/a/d/a/e/k;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-static {v1}, Le/f/a/d/a/e/k;->c(Le/f/a/d/a/e/k;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->j(Le/f/a/d/a/e/k;)V

    iget-object v0, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le/f/a/d/a/e/k;->a(Le/f/a/d/a/e/k;Landroid/os/IInterface;)V

    iget-object v0, p0, Le/f/a/d/a/e/e;->c:Le/f/a/d/a/e/k;

    invoke-static {v0}, Le/f/a/d/a/e/k;->i(Le/f/a/d/a/e/k;)V

    :cond_0
    return-void
.end method
