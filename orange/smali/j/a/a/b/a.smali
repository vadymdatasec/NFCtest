.class public Lj/a/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/e/j;

.field public final synthetic c:Lj/a/a/b/b;


# direct methods
.method public constructor <init>(Lj/a/a/b/b;Le/f/e/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/a/a/b/a;->c:Lj/a/a/b/b;

    iput-object p2, p0, Lj/a/a/b/a;->b:Le/f/e/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj/a/a/b/a;->c:Lj/a/a/b/b;

    invoke-static {v0}, Lj/a/a/b/b;->a(Lj/a/a/b/b;)Lj/a/a/b/b$a;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lj/a/a/b/a;->c:Lj/a/a/b/b;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lj/a/a/b/b;->a(Lj/a/a/b/b;Lj/a/a/b/b$a;)Lj/a/a/b/b$a;

    .line 3
    iget-object v1, p0, Lj/a/a/b/a;->c:Lj/a/a/b/b;

    invoke-virtual {v1}, Lj/a/a/a/a;->e()V

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lj/a/a/b/a;->b:Le/f/e/j;

    invoke-interface {v0, v1}, Lj/a/a/b/b$a;->a(Le/f/e/j;)V

    :cond_0
    return-void
.end method
