.class public final Le/b/a/d0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/n;


# static fields
.field public static final b:Le/b/a/d0/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/d0/c;

    invoke-direct {v0}, Le/b/a/d0/c;-><init>()V

    sput-object v0, Le/b/a/d0/c;->b:Le/b/a/d0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/b/a/d0/c;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/d0/c;->b:Le/b/a/d0/c;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
