.class public final synthetic Le/f/c/l/e/o/q3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/o/q3/h;


# static fields
.field public static final a:Le/f/c/l/e/o/q3/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/l/e/o/q3/f;

    invoke-direct {v0}, Le/f/c/l/e/o/q3/f;-><init>()V

    sput-object v0, Le/f/c/l/e/o/q3/f;->a:Le/f/c/l/e/o/q3/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/c/l/e/o/q3/h;
    .locals 1

    sget-object v0, Le/f/c/l/e/o/q3/f;->a:Le/f/c/l/e/o/q3/f;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Le/f/c/l/e/o/q3/i;->f(Landroid/util/JsonReader;)Le/f/c/l/e/o/y2;

    move-result-object p1

    return-object p1
.end method
