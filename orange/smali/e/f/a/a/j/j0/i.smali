.class public final Le/f/a/a/j/j0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Le/f/a/a/j/j0/j/y;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/m;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lh/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Landroid/content/Context;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/m;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/j/j0/i;->a:Lh/a/a;

    .line 3
    iput-object p2, p0, Le/f/a/a/j/j0/i;->b:Lh/a/a;

    .line 4
    iput-object p3, p0, Le/f/a/a/j/j0/i;->c:Lh/a/a;

    .line 5
    iput-object p4, p0, Le/f/a/a/j/j0/i;->d:Lh/a/a;

    return-void
.end method

.method public static a(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)Le/f/a/a/j/j0/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/a/a<",
            "Landroid/content/Context;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/k/e;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/j0/j/m;",
            ">;",
            "Lh/a/a<",
            "Le/f/a/a/j/l0/a;",
            ">;)",
            "Le/f/a/a/j/j0/i;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/a/j/j0/i;

    invoke-direct {v0, p0, p1, p2, p3}, Le/f/a/a/j/j0/i;-><init>(Lh/a/a;Lh/a/a;Lh/a/a;Lh/a/a;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/m;Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/y;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2, p3}, Le/f/a/a/j/j0/h;->a(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/m;Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/y;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Lf/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Le/f/a/a/j/j0/j/y;

    return-object p0
.end method


# virtual methods
.method public get()Le/f/a/a/j/j0/j/y;
    .locals 4

    .line 2
    iget-object v0, p0, Le/f/a/a/j/j0/i;->a:Lh/a/a;

    invoke-interface {v0}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Le/f/a/a/j/j0/i;->b:Lh/a/a;

    invoke-interface {v1}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/a/j/j0/k/e;

    iget-object v2, p0, Le/f/a/a/j/j0/i;->c:Lh/a/a;

    invoke-interface {v2}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/a/j/j0/j/m;

    iget-object v3, p0, Le/f/a/a/j/j0/i;->d:Lh/a/a;

    invoke-interface {v3}, Lh/a/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f/a/a/j/l0/a;

    invoke-static {v0, v1, v2, v3}, Le/f/a/a/j/j0/i;->a(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/m;Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/j0/i;->get()Le/f/a/a/j/j0/j/y;

    move-result-object v0

    return-object v0
.end method
