.class public final Le/h/b/a/p/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Le/h/b/a/p/c;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/h/b/a/p/c;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/p/d;->a:Landroid/content/Context;

    iput-object p2, p0, Le/h/b/a/p/d;->b:Le/h/b/a/p/c;

    const-string p1, "AppUpdatesChecker"

    .line 2
    iput-object p1, p0, Le/h/b/a/p/d;->c:Ljava/lang/String;

    return-void
.end method

.method public static final a(Le/h/b/a/p/d;Le/f/a/d/a/a/a;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Le/h/b/a/p/d;->c:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Le/f/a/d/a/a/a;->m()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Update Check task succeeded with availability "

    invoke-static {v2, v1}, Li/h/c/k;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-virtual {p0}, Le/h/b/a/p/d;->b()Le/h/b/a/p/c;

    move-result-object p0

    .line 9
    invoke-virtual {p1}, Le/f/a/d/a/a/a;->m()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 10
    new-instance p1, Le/h/b/a/p/j;

    invoke-direct {p1, p0}, Le/h/b/a/p/j;-><init>(Le/h/b/a/p/c;)V

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Void;

    invoke-virtual {p1, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-interface {p0}, Le/h/b/a/p/c;->a()V

    :goto_0
    return-void
.end method

.method public static final a(Le/h/b/a/p/d;Le/f/a/d/a/i/d;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iget-object p0, p0, Le/h/b/a/p/d;->c:Ljava/lang/String;

    const-string p1, "Update Check task completed"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/b/a/p/d;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/a/d/a/a/c;->a(Landroid/content/Context;)Le/f/a/d/a/a/b;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Le/f/a/d/a/a/b;->a()Le/f/a/d/a/i/d;

    move-result-object v0

    .line 3
    new-instance v1, Le/h/b/a/p/a;

    invoke-direct {v1, p0}, Le/h/b/a/p/a;-><init>(Le/h/b/a/p/d;)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/d;->a(Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;

    .line 4
    new-instance v1, Le/h/b/a/p/b;

    invoke-direct {v1, p0}, Le/h/b/a/p/b;-><init>(Le/h/b/a/p/d;)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/d;->a(Le/f/a/d/a/i/a;)Le/f/a/d/a/i/d;

    return-void
.end method

.method public final b()Le/h/b/a/p/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/p/d;->b:Le/h/b/a/p/c;

    return-object v0
.end method
