.class public final Le/f/a/d/a/b/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/b/j3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/q;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/t1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/q;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/t1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/e3;->a:Le/f/a/d/a/e/a0;

    iput-object p2, p0, Le/f/a/d/a/b/e3;->b:Le/f/a/d/a/e/a0;

    iput-object p3, p0, Le/f/a/d/a/b/e3;->c:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/e3;->a:Le/f/a/d/a/e/a0;

    check-cast v0, Le/f/a/d/a/b/f3;

    invoke-virtual {v0}, Le/f/a/d/a/b/f3;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/b/e3;->b:Le/f/a/d/a/e/a0;

    invoke-static {v1}, Le/f/a/d/a/e/z;->b(Le/f/a/d/a/e/a0;)Le/f/a/d/a/e/x;

    move-result-object v1

    iget-object v2, p0, Le/f/a/d/a/b/e3;->c:Le/f/a/d/a/e/a0;

    invoke-static {v2}, Le/f/a/d/a/e/z;->b(Le/f/a/d/a/e/a0;)Le/f/a/d/a/e/x;

    move-result-object v2

    invoke-static {v0}, Le/f/a/d/a/b/a3;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {v1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Le/f/a/d/a/b/j3;

    invoke-static {v0}, Le/f/a/d/a/e/m;->b(Ljava/lang/Object;)V

    return-object v0
.end method
