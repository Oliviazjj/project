//package org.springframework.samples.petclinic.web;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.springframework.samples.petclinic.model.EmployeeType;
//import org.springframework.samples.petclinic.service.ClinicService;
//
//import java.text.ParseException;
//import java.util.*;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * Test class for {@link PetTypeFormatter}
// *
// * @author Colin But
// */
//@RunWith(MockitoJUnitRunner.class)
//public class PetTypeFormatterTests {
//
//    @Mock
//    private ClinicService clinicService;
//
//    private PetTypeFormatter petTypeFormatter;
//
//    @Before
//    public void setup() {
//        petTypeFormatter = new PetTypeFormatter(clinicService);
//    }
//
//    @Test
//    public void testPrint() {
//        EmployeeType petType = new EmployeeType();
//        petType.setName("Hamster");
//        String petTypeName = petTypeFormatter.print(petType, Locale.ENGLISH);
//        assertEquals("Hamster", petTypeName);
//    }
//
//    @Test
//    public void shouldParse() throws ParseException {
//        Mockito.when(clinicService.findPetTypes()).thenReturn(makePetTypes());
//        EmployeeType petType = petTypeFormatter.parse("Bird", Locale.ENGLISH);
//        assertEquals("Bird", petType.getName());
//    }
//
//    @Test(expected = ParseException.class)
//    public void shouldThrowParseException() throws ParseException {
//        Mockito.when(clinicService.findPetTypes()).thenReturn(makePetTypes());
//        petTypeFormatter.parse("Fish", Locale.ENGLISH);
//    }
//
//    /**
//     * Helper method to produce some sample pet types just for test purpose
//     *
//     * @return {@link Collection} of {@link EmployeeType}
//     */
//    private Collection<EmployeeType> makePetTypes() {
//        Collection<EmployeeType> petTypes = new ArrayList<>();
//        petTypes.add(new EmployeeType(){
//            {
//                setName("Dog");
//            }
//        });
//        petTypes.add(new EmployeeType(){
//            {
//                setName("Bird");
//            }
//        });
//        return petTypes;
//    }
//
//}
