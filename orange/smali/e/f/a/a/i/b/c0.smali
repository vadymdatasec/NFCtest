.class public final enum Le/f/a/a/i/b/c0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/a/a/i/b/c0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/a/a/i/b/c0;

.field public static final enum c:Le/f/a/a/i/b/c0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le/f/a/a/i/b/c0;

    const/4 v1, 0x0

    const-string v2, "UNKNOWN"

    invoke-direct {v0, v2, v1, v1}, Le/f/a/a/i/b/c0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/c0;->b:Le/f/a/a/i/b/c0;

    .line 2
    new-instance v0, Le/f/a/a/i/b/c0;

    const-string v1, "ANDROID_FIREBASE"

    const/4 v2, 0x1

    const/16 v3, 0x17

    invoke-direct {v0, v1, v2, v3}, Le/f/a/a/i/b/c0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/c0;->c:Le/f/a/a/i/b/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method
