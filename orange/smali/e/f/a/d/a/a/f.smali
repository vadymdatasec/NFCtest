.class public final Le/f/a/d/a/a/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/a/b;


# instance fields
.field public final a:Le/f/a/d/a/a/o;

.field public final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Le/f/a/d/a/a/o;Le/f/a/d/a/a/d;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Le/f/a/d/a/a/f;->a:Le/f/a/d/a/a/o;

    iput-object p3, p0, Le/f/a/d/a/a/f;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Le/f/a/d/a/i/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/d/a/i/d<",
            "Le/f/a/d/a/a/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/a/f;->a:Le/f/a/d/a/a/o;

    iget-object v1, p0, Le/f/a/d/a/a/f;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/d/a/a/o;->a(Ljava/lang/String;)Le/f/a/d/a/i/d;

    move-result-object v0

    return-object v0
.end method
