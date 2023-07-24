.class public final synthetic Le/f/a/a/j/j0/k/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/f0;


# static fields
.field public static final a:Le/f/a/a/j/j0/k/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/a0;

    invoke-direct {v0}, Le/f/a/a/j/j0/k/a0;-><init>()V

    sput-object v0, Le/f/a/a/j/j0/k/a0;->a:Le/f/a/a/j/j0/k/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/a/a/j/j0/k/f0;
    .locals 1

    sget-object v0, Le/f/a/a/j/j0/k/a0;->a:Le/f/a/a/j/j0/k/a0;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Le/f/a/a/j/j0/k/i0;->b(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
