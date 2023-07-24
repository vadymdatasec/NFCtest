.class public final Le/f/a/d/a/b/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/b/a3;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/a3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/f3;->a:Le/f/a/d/a/b/a3;

    return-void
.end method

.method public static a(Le/f/a/d/a/b/a3;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0}, Le/f/a/d/a/b/a3;->a()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Le/f/a/d/a/e/m;->b(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le/f/a/d/a/b/f3;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/f3;->a:Le/f/a/d/a/b/a3;

    invoke-static {v0}, Le/f/a/d/a/b/f3;->a(Le/f/a/d/a/b/a3;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
