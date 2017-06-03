
//interface dapat mengExtends lebih dari satu interface lain
// interface tidak dapat mengImplementasikan interface
package pkginterface;

/**
 *
 * @author ADe25
 */
interface harian {}
interface bulanan{}
interface tahunan{}
interface laporan extends harian, bulanan, tahunan{
}
interface tampil implements laporan {}
