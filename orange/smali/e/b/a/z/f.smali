.class public final Le/b/a/z/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/d;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Le/b/a/z/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/b/a/z/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/b/a/z/f;->b:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/b/a/z/f;->c:Le/b/a/z/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/b/a/z/f;->d()V

    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/b/a/z/f;->e()V

    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/z/f;->b:Landroid/content/Context;

    invoke-static {v0}, Le/b/a/z/k0;->a(Landroid/content/Context;)Le/b/a/z/k0;

    move-result-object v0

    iget-object v1, p0, Le/b/a/z/f;->c:Le/b/a/z/c;

    invoke-virtual {v0, v1}, Le/b/a/z/k0;->a(Le/b/a/z/c;)V

    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/z/f;->b:Landroid/content/Context;

    invoke-static {v0}, Le/b/a/z/k0;->a(Landroid/content/Context;)Le/b/a/z/k0;

    move-result-object v0

    iget-object v1, p0, Le/b/a/z/f;->c:Le/b/a/z/c;

    invoke-virtual {v0, v1}, Le/b/a/z/k0;->b(Le/b/a/z/c;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method
