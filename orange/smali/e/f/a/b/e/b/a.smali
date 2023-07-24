.class public abstract Le/f/a/b/e/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Le/f/a/b/e/b/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/f/a/b/e/b/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/a/b/e/b/c;-><init>(Le/f/a/b/e/b/d;)V

    .line 2
    sput-object v0, Le/f/a/b/e/b/a;->a:Le/f/a/b/e/b/b;

    return-void
.end method

.method public static a()Le/f/a/b/e/b/b;
    .locals 1

    .line 1
    sget-object v0, Le/f/a/b/e/b/a;->a:Le/f/a/b/e/b/b;

    return-object v0
.end method
