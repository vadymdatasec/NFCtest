.class public Le/c/a/s;
.super Le/c/a/i1;
.source "SourceFile"


# static fields
.field public static b:Le/c/a/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/c/a/s;

    invoke-direct {v0}, Le/c/a/s;-><init>()V

    sput-object v0, Le/c/a/s;->b:Le/c/a/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/c/a/i1;-><init>()V

    return-void
.end method

.method public static a()Le/c/a/s;
    .locals 1

    .line 1
    sget-object v0, Le/c/a/s;->b:Le/c/a/s;

    return-object v0
.end method
