.class public final Le/f/a/d/a/b/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Le/f/a/d/a/b/d2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/j3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/l1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/x0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/b0;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/j3;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/l1;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Le/f/a/d/a/e/a0<",
            "Le/f/a/d/a/b/x0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/e2;->a:Le/f/a/d/a/e/a0;

    iput-object p2, p0, Le/f/a/d/a/b/e2;->b:Le/f/a/d/a/e/a0;

    iput-object p3, p0, Le/f/a/d/a/b/e2;->c:Le/f/a/d/a/e/a0;

    iput-object p4, p0, Le/f/a/d/a/b/e2;->d:Le/f/a/d/a/e/a0;

    iput-object p5, p0, Le/f/a/d/a/b/e2;->e:Le/f/a/d/a/e/a0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Le/f/a/d/a/b/e2;->a:Le/f/a/d/a/e/a0;

    invoke-interface {v0}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Le/f/a/d/a/b/e2;->b:Le/f/a/d/a/e/a0;

    invoke-static {v1}, Le/f/a/d/a/e/z;->b(Le/f/a/d/a/e/a0;)Le/f/a/d/a/e/x;

    move-result-object v4

    iget-object v1, p0, Le/f/a/d/a/b/e2;->c:Le/f/a/d/a/e/a0;

    invoke-interface {v1}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Le/f/a/d/a/b/e2;->d:Le/f/a/d/a/e/a0;

    invoke-static {v2}, Le/f/a/d/a/e/z;->b(Le/f/a/d/a/e/a0;)Le/f/a/d/a/e/x;

    move-result-object v6

    iget-object v2, p0, Le/f/a/d/a/b/e2;->e:Le/f/a/d/a/e/a0;

    invoke-interface {v2}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v2

    new-instance v8, Le/f/a/d/a/b/d2;

    move-object v3, v0

    check-cast v3, Le/f/a/d/a/b/b0;

    move-object v5, v1

    check-cast v5, Le/f/a/d/a/b/l1;

    move-object v7, v2

    check-cast v7, Le/f/a/d/a/b/x0;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Le/f/a/d/a/b/d2;-><init>(Le/f/a/d/a/b/b0;Le/f/a/d/a/e/x;Le/f/a/d/a/b/l1;Le/f/a/d/a/e/x;Le/f/a/d/a/b/x0;)V

    return-object v8
.end method
