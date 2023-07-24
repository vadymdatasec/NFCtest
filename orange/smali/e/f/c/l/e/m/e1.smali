.class public abstract Le/f/c/l/e/m/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Le/f/c/l/e/o/o3;Ljava/lang/String;)Le/f/c/l/e/m/e1;
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/m/c;

    invoke-direct {v0, p0, p1}, Le/f/c/l/e/m/c;-><init>(Le/f/c/l/e/o/o3;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Le/f/c/l/e/o/o3;
.end method

.method public abstract b()Ljava/lang/String;
.end method
