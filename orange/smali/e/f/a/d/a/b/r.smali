.class public final Le/f/a/d/a/b/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/b/q;",
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
            "Le/f/a/d/a/b/x0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/x0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/r;->a:Le/f/a/d/a/e/a0;

    iput-object p2, p0, Le/f/a/d/a/b/r;->b:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/r;->a:Le/f/a/d/a/e/a0;

    check-cast v0, Le/f/a/d/a/b/f3;

    invoke-virtual {v0}, Le/f/a/d/a/b/f3;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/b/r;->b:Le/f/a/d/a/e/a0;

    invoke-interface {v1}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Le/f/a/d/a/b/q;

    check-cast v1, Le/f/a/d/a/b/x0;

    invoke-direct {v2, v0, v1}, Le/f/a/d/a/b/q;-><init>(Landroid/content/Context;Le/f/a/d/a/b/x0;)V

    return-object v2
.end method
