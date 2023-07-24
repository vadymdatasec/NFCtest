.class public final Le/f/a/a/j/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/d0;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/f/a/a/j/j;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/a/a/j/k;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)Le/f/a/a/j/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/a/a/j/k;->a(Landroid/content/Context;)Le/f/a/a/j/k;

    return-object p0
.end method

.method public a()Le/f/a/a/j/e0;
    .locals 3

    .line 3
    iget-object v0, p0, Le/f/a/a/j/k;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lf/a/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 4
    new-instance v0, Le/f/a/a/j/l;

    iget-object v1, p0, Le/f/a/a/j/k;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le/f/a/a/j/l;-><init>(Landroid/content/Context;Le/f/a/a/j/j;)V

    return-object v0
.end method

.method public a(Landroid/content/Context;)Le/f/a/a/j/k;
    .locals 0

    .line 2
    invoke-static {p1}, Lf/a/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Le/f/a/a/j/k;->a:Landroid/content/Context;

    return-object p0
.end method
