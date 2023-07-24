.class public final Le/f/a/d/a/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/a/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/a/o;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/a/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
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
            "Le/f/a/d/a/a/o;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/a/d;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/a/g;->a:Le/f/a/d/a/e/a0;

    iput-object p2, p0, Le/f/a/d/a/a/g;->b:Le/f/a/d/a/e/a0;

    iput-object p3, p0, Le/f/a/d/a/a/g;->c:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/a/g;->a:Le/f/a/d/a/e/a0;

    invoke-interface {v0}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/a/g;->b:Le/f/a/d/a/e/a0;

    invoke-interface {v1}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/a/d;

    iget-object v2, p0, Le/f/a/d/a/a/g;->c:Le/f/a/d/a/e/a0;

    check-cast v2, Le/f/a/d/a/a/j;

    invoke-virtual {v2}, Le/f/a/d/a/a/j;->b()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Le/f/a/d/a/a/f;

    check-cast v0, Le/f/a/d/a/a/o;

    invoke-direct {v3, v0, v1, v2}, Le/f/a/d/a/a/f;-><init>(Le/f/a/d/a/a/o;Le/f/a/d/a/a/d;Landroid/content/Context;)V

    return-object v3
.end method
